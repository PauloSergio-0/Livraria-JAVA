package br.com.paulo.biblioteca.sistema.excecoes;

import br.com.paulo.biblioteca.sistema.livros.Livro;

public class LivroException extends Exception{
    private final Livro livro;

    public LivroException(Livro livro, String tipoOperacao){

        super("O livro '"+livro.getTitulo()+"' já foi "+ tipoOperacao);
        this.livro = livro;

    }

    public Livro getLivro() {
        return livro;
    }
}
