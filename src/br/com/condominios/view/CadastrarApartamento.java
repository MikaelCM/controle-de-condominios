package br.com.condominios.view;

import br.com.condominios.controller.ApartamentoController;
import br.com.condominios.model.Apartamento;

import java.util.Scanner;

public class CadastrarApartamento {
    private ApartamentoController controller = new ApartamentoController();

    public Apartamento menuCadApt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Opção: Cadastrar Apartamento --");

        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Está ocupado? (sim/nao) ");
        String resposta = scanner.nextLine();
        boolean isOcupado = resposta.equalsIgnoreCase("sim");

        Apartamento apartamento = new Apartamento(numero, isOcupado);

        controller.cadastrarApartamento(apartamento);

        System.out.println("---------------------------------------------------------");
        if (isOcupado) {
            System.out.println("Apartamento " + apartamento.getApt() + " ocupado registrado com sucesso!");

        } else {
            System.out.println("Apartamento " + apartamento.getApt() + " disponível registrado com sucesso!");
        }
        System.out.println("---------------------------------------------------------");

        return apartamento;
    }
}
