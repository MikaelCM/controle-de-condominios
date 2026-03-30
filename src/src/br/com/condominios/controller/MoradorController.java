package br.com.condominios.controller;

import br.com.condominios.interfaces.CadastroMorador;
import br.com.condominios.model.Morador;
import br.com.condominios.repository.ListaDeMoradores;

import java.util.List;

public class MoradorController implements CadastroMorador<Morador> {
    private static ListaDeMoradores lista = new ListaDeMoradores();

    @Override
    public void cadastrarMorador(Morador morador) {
        lista.salvarEmLista(morador);
    }

    @Override
    public List<Morador> listarMoradores() {
        return lista.getMoradores();
    }
}