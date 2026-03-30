package br.com.condominios.controller;

import br.com.condominios.model.Apartamento;
import br.com.condominios.repository.ListaDeApartamentos;

import java.util.List;

public class ApartamentoController {
    private static ListaDeApartamentos lista = new ListaDeApartamentos();

    public void cadastrarApartamento(Apartamento apartamento) {
        lista.salvarEmLista(apartamento);
    }

    public List<Apartamento> listarApartamentos() {
        return lista.getApartamentos();
    }
}