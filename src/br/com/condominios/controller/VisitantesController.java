package br.com.condominios.controller;

import br.com.condominios.model.Visitante;
import br.com.condominios.repository.ListaDeVisitantes;

import java.util.List;

public class VisitantesController {
    private static ListaDeVisitantes lista = new ListaDeVisitantes();

    public void cadastrarVisitante(Visitante visitante) {
        lista.salvarEmLista(visitante);
    }

    public List<Visitante> listarVisitantes() {
        return lista.getVisitantes();
    }
}
