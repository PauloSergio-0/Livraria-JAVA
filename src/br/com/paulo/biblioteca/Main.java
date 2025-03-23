package br.com.paulo.biblioteca;

import java.util.Scanner;
import java.util.Locale;
import br.com.paulo.biblioteca.sistema.livros.Biblioteca;
import br.com.paulo.biblioteca.sistema.livros.Livro;

public class Main {
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Biblioteca sistemaBiblioteca = new Biblioteca();

        sistemaBiblioteca.adcionarLivro(registroLivro());
        sistemaBiblioteca.listarLivros();
        sistemaBiblioteca.removerLivro(sistemaBiblioteca.itemsLista());
        sistemaBiblioteca.listarLivros();
    }

    public static Livro registroLivro(){
        System.out.println("Qual o Titulo do livro");
        String tituloLivro = scanner.nextLine();

        System.out.println("Qual o autor do Livro: ");
        String autorLivro = scanner.nextLine();

        System.out.println("Qual o Ano de Publicação do Livro: ");
        int anoPlubLivro = scanner.nextInt();

        Livro livro = new Livro(tituloLivro,autorLivro, anoPlubLivro);
        return livro;


    }
}
