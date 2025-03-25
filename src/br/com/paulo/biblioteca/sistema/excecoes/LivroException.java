package br.com.paulo.biblioteca.sistema.excecoes;

import br.com.paulo.biblioteca.sistema.livros.Livro;

public class LivroException extends Exception{
    private final Livro livro;

    public LivroException(Livro livro){

        super("O livro '"+livro.getTitulo()+"' já foi emprestado");
        this.livro = livro;

    }

    public Livro getLivro() {
        return livro;
    }
}
