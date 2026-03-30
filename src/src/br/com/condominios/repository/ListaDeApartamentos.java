package br.com.condominios.repository;

import br.com.condominios.model.Apartamento;

import java.util.ArrayList;
import java.util.List;

public class ListaDeApartamentos {
    private List<Apartamento> apartamentos = new ArrayList<>();

    public void salvarEmLista(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }
}
