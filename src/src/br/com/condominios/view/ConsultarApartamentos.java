package br.com.condominios.view;

import br.com.condominios.controller.ApartamentoController;
import br.com.condominios.model.Apartamento;

import java.util.List;

public class ConsultarApartamentos {
    ApartamentoController controller = new ApartamentoController();

    public void getApts() {
        List<Apartamento> apts = controller.listarApartamentos();

        if (apts.isEmpty()) {
            System.out.println("Nenhum apartamento registrado.");
            return;
        }

        System.out.println("--- APARTAMENTOS CADASTRADOS ---");
        for (Apartamento apt : apts) {
            System.out.println("Apartamento - " + apt.getApt());
            System.out.println("Ocupado? - " + (apt.isOcupado() ? "Sim" : "Não"));
            System.out.println("---------------------------------");
        }
    }
}