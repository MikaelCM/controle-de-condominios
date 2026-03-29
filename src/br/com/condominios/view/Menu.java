package br.com.condominios.view;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        CadastrarMorador cadastrarMorador = new CadastrarMorador();
        CadastrarVisitantes cadastrarVisitantes = new CadastrarVisitantes();
        CadastrarApartamento cadastrarApartamento = new CadastrarApartamento();
        RegistrarPagamento registrarPagamento = new RegistrarPagamento();

        ConsultarMoradores consultarMoradores = new ConsultarMoradores();
        ConsultarApartamentos consultarApartamentos = new ConsultarApartamentos();
        ConsultarVisitantes consultarVisitantes = new ConsultarVisitantes();
        ConsultarPagamentos consultarPagamentos = new ConsultarPagamentos();

        int opcao;

        do {
            System.out.println("--- CONTROLE DE CONDOMÍNIOS ---");
            System.out.println("1 - Cadastrar morador");
            System.out.println("2 - Cadastrar apartamento");
            System.out.println("3 - Registrar visitante");
            System.out.println("4 - Registrar pagamento");
            System.out.println("5 - Consultar moradores");
            System.out.println("6 - Consultar apartamentos");
            System.out.println("7 - Consultar visitantes");
            System.out.println("8 - Consultar pagamentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarMorador.menuCadMorador();
                    break;

                case 2:
                    cadastrarApartamento.menuCadApt();
                    break;

                case 3:
                    cadastrarVisitantes.menuCadVisitantes();
                    break;

                case 4:
                    registrarPagamento.menuRegistrarPagamento();
                    break;

                case 5:
                    consultarMoradores.getMoradores();
                    break;

                case 6:
                    consultarApartamentos.getApts();
                    break;

                case 7:
                    consultarVisitantes.getVisitantes();
                    break;

                case 8:
                    consultarPagamentos.getPagamentos();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}