package br.com.condominios.model;

public class Apartamento {
    private int numero;
    private boolean ocupado;

    public Apartamento(int numero, boolean ocupado) {
        this.numero = numero;
        this.ocupado = ocupado;
    }

    public int getApt() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
