package br.com.paulo.biblioteca.sistema.livros;

import java.util.Scanner;
import java.util.Locale;
import br.com.paulo.biblioteca.sistema.usuarios.Usuario;
import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<Livro> listaLivro = new ArrayList<>();
    private final ArrayList<Usuario> listaUsuario = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void adcionarLivro(Livro livro){
        listaLivro.add(livro);
        System.out.println("Livro Adicionado!");
    }

    public Livro itemsLista(){
        for(int i = 1; i <= listaLivro.size(); i++){

            System.out.println("id: "+i);
            System.out.println(listaLivro.get(i-1));
        }

        System.out.println("Qual Livo vai remover? ");
        int livroIndece = scanner.nextInt();

        if(livroIndece <= listaLivro.size()){
            return listaLivro.get(livroIndece-1);
        } else {
            System.out.println("O indece não encontrado: id "+ livroIndece);
        }

        return null;
    }

    public void removerLivro(Livro livro){


        listaLivro.remove(livro);
        System.out.println("Livro Removido!");
    }

    public void listarLivros(){
        System.out.println("Lista de livros");
        for (Livro livro: listaLivro){

            System.out.println(livro.exibirDetalhes());
        }
    }

    public void adcionarUsuario(Usuario usuario){
        listaUsuario.add(usuario);
        System.out.println("Usuario Adicionado!");
    }

    public void removerUsuario(Usuario usuario){
        listaUsuario.remove(usuario);
        System.out.println("Usuario Removido!");
    }

    public void listarUsuarios(){
        System.out.println("Lista de Usuarios");
        System.out.println(listaUsuario);
    }
}
