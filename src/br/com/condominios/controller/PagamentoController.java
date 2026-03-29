package br.com.condominios.controller;

import br.com.condominios.model.Pagamento;
import br.com.condominios.repository.ListaDePagamentos;

import java.util.List;

public class PagamentoController {
    private static ListaDePagamentos lista = new ListaDePagamentos();

    public void registrarPagamento(Pagamento pagamento) {
        lista.registrarPagamento(pagamento);
    }

    public List<Pagamento> listarPagamentos() {
        return lista.getPagamentos();
    }
}
