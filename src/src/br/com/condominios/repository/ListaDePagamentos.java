package br.com.condominios.repository;

import br.com.condominios.model.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class ListaDePagamentos {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void registrarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
}
