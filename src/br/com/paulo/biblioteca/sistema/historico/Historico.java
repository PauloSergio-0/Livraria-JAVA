package br.com.paulo.biblioteca.sistema.historico;

public class Historico {
    private final String nomeUsuario;
    private final String tituloLivro;
    private final String autorLivro;
    private final String tipoOperacao;

    public Historico(String nomeUsuario, String tituloLivro , String autorLivro, String tipoOperacao){
        this.nomeUsuario = nomeUsuario;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.tipoOperacao = tipoOperacao;
    }

    public String detalheMovimetacao(){

        return "Usuario: " + nomeUsuario +
                "\nTitulo Livro: " + tituloLivro+
                "\nAutor Livro :"+ autorLivro+
                "\nOperação :"+ tipoOperacao+
                "\n";

    }


}
