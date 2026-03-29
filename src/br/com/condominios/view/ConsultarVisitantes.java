package br.com.condominios.view;

import br.com.condominios.controller.VisitantesController;
import br.com.condominios.model.Visitante;

import java.util.List;

public class ConsultarVisitantes {
    VisitantesController controller = new VisitantesController();

    public void getVisitantes() {
        List<Visitante> visitantes = controller.listarVisitantes();

        if (visitantes.isEmpty()) {
            System.out.println("Nenhum visitante cadastrado.");
            return;
        }

        System.out.println("--- VISITANTES CADASTRADOS ---");
        for (Visitante v : visitantes) {
            System.out.println("Nome: " + v.getNome());
            System.out.println("CPF: " + v.getCpf());
            System.out.println("Última visita: " + v.getDataDeVisita());
            System.out.println("----------------------------");
        }
    }
}
