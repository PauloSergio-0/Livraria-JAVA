package br.com.paulo.biblioteca.sistema.excecoes;

public class ListaVazia extends Exception {

    public ListaVazia(String tipoLista) {
      super("Não há "+ tipoLista);
    }
}
