package br.com.condominios.model;

public class Visitante extends Pessoa {
    private String dataDeVisita;

    public Visitante(String nome, String cpf, String dataDeVisita) {
        super(nome, cpf);
        this.dataDeVisita = dataDeVisita;
    }

    public String getDataDeVisita() {
        return dataDeVisita;
    }
}
