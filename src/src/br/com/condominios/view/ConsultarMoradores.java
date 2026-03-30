package br.com.condominios.view;

import br.com.condominios.controller.MoradorController;
import br.com.condominios.model.Morador;

import java.util.List;

public class ConsultarMoradores {
    MoradorController controller = new MoradorController();

    public void getMoradores() {
        List<Morador> moradores = controller.listarMoradores();

        if (moradores.isEmpty()) {
            System.out.println("Nenhum morador cadastrado.");
            return;
        }

        System.out.println("--- MORADORES CADASTRADOS ---");
        for (Morador m : moradores) {
            System.out.println("Nome: " + m.getNome());
            System.out.println("CPF: " + m.getCpf());
            System.out.println("Apartamento: " + m.getMoradorApt());
            System.out.println("----------------------------");
        }
    }
}
