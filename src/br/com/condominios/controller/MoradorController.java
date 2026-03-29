package br.com.condominios.controller;

import br.com.condominios.model.Morador;
import br.com.condominios.repository.ListaDeMoradores;

import java.util.List;

public class MoradorController {
    private static ListaDeMoradores lista = new ListaDeMoradores();

    public void cadastrarMorador(Morador morador) {
        lista.salvarEmLista(morador);
    }

    public List<Morador> listarMoradores() {
        return lista.getMoradores();
    }
}