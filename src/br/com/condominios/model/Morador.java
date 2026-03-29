package br.com.condominios.model;

public class Morador extends Pessoa {
    private int apt;

    public Morador(String nome, String cpf, int apt) {
        super(nome, cpf);
        this.apt = apt;
    }

    public int getMoradorApt() {
        return apt;
    }
};