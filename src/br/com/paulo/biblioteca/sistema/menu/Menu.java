package br.com.paulo.biblioteca.sistema.menu;

import br.com.paulo.biblioteca.sistema.livros.Biblioteca;
import br.com.paulo.biblioteca.sistema.livros.Livro;
import br.com.paulo.biblioteca.sistema.usuarios.Usuario;

import java.util.Scanner;
import java.util.Locale;



public class Menu {
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private int idUsuario;

    public void menuSistema() {
        Biblioteca sistemaBiblioteca = new Biblioteca();

        while (true) {
            System.out.println(
                    """
                            Menu:\s
                            1. adcionar Livro
                            2. adcionar Usuario
                            3. Emprentar livro
                            4. Devolver livro
                            5. exibir detalhes do livro
                            6. listar livros
                            7. listar usuarios
                            8. remover livro
                            9. remover usuario
                            10. sair
                           \s"""
            );
            System.out.println("Escolha uma opçao:");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                sistemaBiblioteca.adcionarLivro(registroLivro());
            } else if (opcao == 2) {
                sistemaBiblioteca.adcionarUsuario(registroUsuario());
            } else if (opcao == 3){
                sistemaBiblioteca.itemsUsuario().emprestarLivro(sistemaBiblioteca.itemsListaLivro());

            } else if (opcao == 4){
                sistemaBiblioteca.itemsUsuario().devolverLivro(sistemaBiblioteca.itemsListaLivro());
            } else if (opcao == 5) {
                sistemaBiblioteca.itemsListaLivro().exibirDetalhes();
            } else if (opcao== 6) {
                sistemaBiblioteca.listarLivros();
            } else if (opcao == 7) {
                sistemaBiblioteca.listarUsuarios();
            } else if (opcao == 8){
                sistemaBiblioteca.removerLivro(sistemaBiblioteca.itemsListaLivro());
            } else if (opcao == 9) {
                sistemaBiblioteca.removerUsuario(sistemaBiblioteca.itemsUsuario());
            } else if (opcao == 10){
                System.out.println("Saindo do sistema");
                break;
            } else {
                System.out.println("Opção não encontrada");
            }
        }
    }

    private Livro registroLivro(){
        System.out.println("Qual o Titulo do livro");
        String tituloLivro = scanner.nextLine();

        System.out.println("Qual o autor do Livro: ");
        String autorLivro = scanner.nextLine();

        System.out.println("Qual o Ano de Publicação do Livro: ");
        int anoPlubLivro = scanner.nextInt();

        return new Livro(tituloLivro,autorLivro, anoPlubLivro);
    }

    private Usuario registroUsuario(){

        System.out.println("Nome do usuário: ");
        String nome = scanner.nextLine();

        this.idUsuario++;

        return new Usuario(nome,this.idUsuario);
    }


}
