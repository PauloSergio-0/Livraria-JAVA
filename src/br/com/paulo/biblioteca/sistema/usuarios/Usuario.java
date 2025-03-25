package br.com.paulo.biblioteca.sistema.usuarios;

import br.com.paulo.biblioteca.sistema.excecoes.LivroException;
import br.com.paulo.biblioteca.sistema.livros.Livro;

import java.util.Objects;

public class Usuario {
    private final String nome;
    private final int idUsuario;
    private int livrosPosse;

    public String getNome() {
        return nome;
    }

    public int getLivrosPosse() {
        return livrosPosse;
    }

    public Usuario(String nome, int idUsuario){
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public void emprestarLivro(Livro livro) throws LivroException {
        if(!livro.isDisponivel()){
            throw new LivroException(livro,"emprestado");
        }

        if(verificadorPosseLivro("emprestimo")) {
            this.livrosPosse++;
            livro.emprestarLivro();
        }
    }

    public void devolverLivro(Livro livro) throws LivroException{
        if(livro.isDisponivel()){
            throw  new LivroException(livro, "devolvido");
        }
        if( verificadorPosseLivro("devolucao")) {
            this.livrosPosse--;
            livro.devolverLivro();
        }
    }

    public void detalhesUsuario() {
        System.out.println(
                "Id: " +this.idUsuario +
                "\nNome: " + this.nome +
                "\nLivros em posse: " + this.livrosPosse
        );
    }

    private Boolean verificadorPosseLivro(String tipoOperacao){ //emprestimo ou devolucao


        if (this.livrosPosse < 3 && Objects.equals(tipoOperacao, "emprestimo")){
            return true;
        } else if (this.livrosPosse > 0 && Objects.equals(tipoOperacao, "devolucao")){
            return true;
        } else {
            System.out.printf("Limite atingido para a operação %s ser concluída\n", tipoOperacao);
            return false;
        }
    }
}
