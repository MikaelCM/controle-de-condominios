package br.com.condominios.view;

import br.com.condominios.controller.PagamentoController;
import br.com.condominios.controller.VisitantesController;
import br.com.condominios.model.Pagamento;
import br.com.condominios.model.Visitante;

import java.util.List;

public class ConsultarPagamentos {
    PagamentoController controller = new PagamentoController();

    public void getPagamentos() {
        List<Pagamento> pagamentos = controller.listarPagamentos();

        if (pagamentos.isEmpty()) {
            System.out.println("Nenhum pagamento registrado.");
            return;
        }

        System.out.println("--- PAGAMENTOS REGISTRADOS ---");
        for (Pagamento pgt : pagamentos) {
            System.out.println("Está pago? " + (pgt.isPago() ? "Sim" : "Não"));
            System.out.println("Apartamento: " + pgt.getApt());
            System.out.println("Mês: " + pgt.getMesReferencia());
            System.out.println("Valor: R$" + pgt.getValor());
            System.out.println("------------------------------");
        }
    }
}
