package br.com.condominios.repository;

import br.com.condominios.model.Morador;

import java.util.ArrayList;
import java.util.List;

public class ListaDeMoradores {
    private List<Morador> moradores = new ArrayList<>();

    public void salvarEmLista(Morador morador) {
        moradores.add(morador);
    }

    public List<Morador> getMoradores() {
        return moradores;
    }
}