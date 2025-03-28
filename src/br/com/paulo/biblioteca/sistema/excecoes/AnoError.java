package br.com.paulo.biblioteca.sistema.excecoes;

public class AnoError extends RuntimeException {
    public AnoError(int data) {
        super("A data tem que ser um numero positivo");
    }
}
