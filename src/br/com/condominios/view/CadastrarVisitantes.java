package br.com.condominios.view;

import br.com.condominios.controller.MoradorController;
import br.com.condominios.controller.VisitantesController;
import br.com.condominios.model.Visitante;

import java.util.Scanner;

public class CadastrarVisitantes {
    private VisitantesController controller = new VisitantesController();

    public Visitante menuCadVisitantes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Opção: Cadastrar Visitante ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data da visita (dd/mm/aaaa):  ");
        String dataVisita = scanner.nextLine();

        Visitante visitante = new Visitante(nome, cpf, dataVisita);

        controller.cadastrarVisitante(visitante);

        System.out.println("---------------------------------------------------------");
        System.out.println("Visitante " + visitante.getNome() + " registrado com sucesso!");
        System.out.println("---------------------------------------------------------");
        return visitante;
    }
}
