package br.com.condominios.repository;

import br.com.condominios.model.Visitante;

import java.util.ArrayList;
import java.util.List;

public class ListaDeVisitantes {
    private List<Visitante> visitantes = new ArrayList<>();

    public void salvarEmLista(Visitante visitante) {
        visitantes.add(visitante);
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }
}