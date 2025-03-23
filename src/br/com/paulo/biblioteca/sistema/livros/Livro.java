package br.com.paulo.biblioteca.sistema.livros;

public class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacoo;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacoo){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacoo = anoPublicacoo;
        this.disponivel = true;
    }

    public void emprestarLivro(){
        this.disponivel = false;
        System.out.println("Livro emprestado!");
    }

    public void devolverLivro(){
        this.disponivel = true;
        System.out.println("Livro devolvido!");
    }

    public String exibirDetalhes(){

        String infoDisponivel = this.disponivel ? "Sim": "Não";

        return  "Titulo: "+ this.titulo +
                "\nAutor: " + this.autor +
                "\nAno Publicação: " + this.anoPublicacoo +
                "\nDisponivel: "+ infoDisponivel;
    }

}
