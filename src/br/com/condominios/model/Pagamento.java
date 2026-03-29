package br.com.condominios.model;

public class Pagamento {
    private int apt;
    private String mesReferencia;
    private double valor;
    private boolean pago;

    public Pagamento(int apt, String mesReferencia, double valor, boolean pago) {
        this.apt = apt;
        this.mesReferencia = mesReferencia;
        this.valor = valor;
        this.pago = pago;
    }

    public int getApt() {
        return apt;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }
}
