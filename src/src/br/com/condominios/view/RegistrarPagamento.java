package br.com.condominios.view;

import br.com.condominios.controller.PagamentoController;
import br.com.condominios.model.Pagamento;

import java.util.Scanner;

public class RegistrarPagamento {
    private PagamentoController controller = new PagamentoController();

    public Pagamento menuRegistrarPagamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Opção: Registrar pagamento --");

        System.out.print("Apartamento: ");
        int apt = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Mês do pagamento (em numerais): ");
        String mesRef = scanner.nextLine();

        System.out.print("Valor: ");
        int valor = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Está pago? (sim/nao) ");
        String resposta = scanner.nextLine();
        boolean isPago = resposta.equalsIgnoreCase("sim");

        Pagamento pagamento = new Pagamento(apt, mesRef, valor, isPago);

        controller.registrarPagamento(pagamento);

        System.out.println("---------------------------------------------------------");
        if (isPago) {
            System.out.println("Pagamento realizado no valor de R$" + pagamento.getValor() + " registrado com sucesso!");

        } else {
            System.out.println("Pagamento no valor de R$" + pagamento.getValor() + ", ainda por realizar, registrado com sucesso!");
        }
        System.out.println("---------------------------------------------------------");

        return pagamento;
    }
}
