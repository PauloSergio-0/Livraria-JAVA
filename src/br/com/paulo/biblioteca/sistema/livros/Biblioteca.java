package br.com.paulo.biblioteca.sistema.livros;

import java.util.Scanner;
import java.util.Locale;

import br.com.paulo.biblioteca.sistema.historico.Historico;
import br.com.paulo.biblioteca.sistema.usuarios.Usuario;
import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<Livro> listaLivro = new ArrayList<>();
    private final ArrayList<Usuario> listaUsuario = new ArrayList<>();
    private final ArrayList<Historico> listaHistorico = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void adcionarHistorico(Historico movimentacao){
        listaHistorico.add(movimentacao);
        System.out.println("Movimentação adicionada!");
    }

    public void listaMovimentcoes(){
        if ( !listaHistorico.isEmpty() ) {
            System.out.println("Lista Historico");
            for (Historico movimencoes : listaHistorico) {
                System.out.println(movimencoes.detalheMovimetacao());
            }
        }else {
            System.out.println("Não há movimentações");
        }
    }

    public void adcionarLivro(Livro livro){
        listaLivro.add(livro);
        System.out.println("Livro Adicionado!");
    }

    public Livro itemsListaLivro(){
        for(int i = 1; i <= listaLivro.size(); i++){

            System.out.println("id: " + i);
            System.out.println(listaLivro.get(i-1).exibirDetalhes());
        }
        while (true) {
            System.out.println("Selecione o livro?");
            int livroIndece = scanner.nextInt();

            if (livroIndece <= listaLivro.size() && livroIndece > 0) {
                return listaLivro.get(livroIndece - 1);
            } else {
                System.out.println("O indece não encontrado: id " + livroIndece);

            }
        }
    }

    public void removerLivro(Livro livro){

        listaLivro.remove(livro);
        System.out.println("Livro Removido!");
    }


    public void listarLivros(){
        if(!listaLivro.isEmpty()) {
            System.out.println("Lista de livros");
            for (Livro livro : listaLivro) {

                System.out.println(livro.exibirDetalhes());
            }
        }else {
            System.out.println("Não há usuario");
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
        if(!listaUsuario.isEmpty()){
            System.out.println("Lista de Usuarios");
            for (Usuario usuario : listaUsuario) {
                usuario.detalhesUsuario();
            }
        } else {
            System.out.println("Não há usuarios");
        }
    }

    public Usuario itemsListaUsuario(){
        for (int i = 1; i <= listaUsuario.size(); i++){
            listaUsuario.get(i-1).detalhesUsuario();
        }
        while (true) {
            System.out.println("Selecione o usuario:");
            int usuarioIndece = scanner.nextInt();

            if (usuarioIndece >= 0 && usuarioIndece <= listaUsuario.size()) {
                return listaUsuario.get(usuarioIndece - 1);
            } else {
                System.out.println("Usuario não identificado");

            }
        }
    }
}
