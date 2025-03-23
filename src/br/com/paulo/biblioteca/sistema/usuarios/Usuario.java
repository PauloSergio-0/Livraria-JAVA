package br.com.paulo.biblioteca.sistema.usuarios;

import br.com.paulo.biblioteca.sistema.livros.Livro;

public class Usuario {
    private String nome;
    private int idUsuario;

    public Usuario(String nome, int idUsuario){
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public void emprestarLivro(Livro livro){
        livro.emprestarLivro();
    }

    public void devolverLivro(Livro livro){
        livro.devolverLivro();
    }
}
