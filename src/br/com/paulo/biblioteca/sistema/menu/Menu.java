package br.com.paulo.biblioteca.sistema.menu;

import br.com.paulo.biblioteca.sistema.historico.Historico;
import br.com.paulo.biblioteca.sistema.livros.Biblioteca;
import br.com.paulo.biblioteca.sistema.livros.Livro;
import br.com.paulo.biblioteca.sistema.usuarios.Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;



public class Menu {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private int idUsuario;

    public void menuSistema() {
        Biblioteca sistemaBiblioteca = new Biblioteca();
        int opcao = 0;

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
                             8. listar movimentacoes
                             9. remover livro
                            10. remover usuario
                            11. sair
                           \s"""
            );



            try {
                System.out.println("Escolha uma opçao:");
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e){
                System.err.println("Error: adicionar um valor do tipo inteiro para acessar as opções");
                scanner.nextLine();
            }



            if (opcao == 1) {
                sistemaBiblioteca.adcionarLivro(registroLivro());
            } else if (opcao == 2) {
                sistemaBiblioteca.adcionarUsuario(registroUsuario());
            } else if (opcao == 3){

                try {
                    Usuario user = sistemaBiblioteca.itemsListaUsuario();
                    Livro livro = sistemaBiblioteca.itemsListaLivro();
                    Historico movimentacao = new Historico(user.getNome(),livro.getTitulo(), livro.getAutor(), "Emprestimo");

                    user.emprestarLivro(livro);
                    sistemaBiblioteca.adcionarHistorico(movimentacao);
                }catch (Exception e){
                    System.err.println("Erro ao emprestar livro: "+ e.getMessage());
                }

            } else if (opcao == 4){
                try {
                    Usuario user = sistemaBiblioteca.itemsListaUsuario();
                    Livro livro = sistemaBiblioteca.itemsListaLivro();
                    Historico movimentacao = new Historico(user.getNome(), livro.getTitulo(), livro.getAutor(), "Devolução");
                    user.devolverLivro(livro);
                    sistemaBiblioteca.adcionarHistorico(movimentacao);
                } catch (Exception e){
                    System.err.println(e.getMessage());
                }
            } else if (opcao == 5) {
                try {
                    sistemaBiblioteca.itemsListaLivro().exibirDetalhes();
                }catch(Exception e){
                    System.err.println(e.getMessage());
                }
            } else if (opcao== 6) {
                try {

                    sistemaBiblioteca.listarLivros();
                } catch (Exception e) {
                   System.err.println(e.getMessage());
                }
            } else if (opcao == 7) {
                sistemaBiblioteca.listarUsuarios();
            } else if (opcao == 8){
                sistemaBiblioteca.listaMovimentcoes();
            } else if (opcao == 9) {
                try {
                    sistemaBiblioteca.removerLivro(sistemaBiblioteca.itemsListaLivro());
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } else if (opcao == 10) {
                try {
                    sistemaBiblioteca.removerUsuario(sistemaBiblioteca.itemsListaUsuario());
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } else if (opcao == 11){
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
