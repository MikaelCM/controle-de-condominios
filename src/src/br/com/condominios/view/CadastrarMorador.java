package br.com.condominios.view;

import br.com.condominios.controller.MoradorController;
import br.com.condominios.model.Morador;
import java.util.Scanner;

public class CadastrarMorador {
    private MoradorController controller = new MoradorController();

    public Morador menuCadMorador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Opção: Cadastrar Morador --");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Apartamento: ");
        int apt = scanner.nextInt();

        Morador morador = new Morador(nome, cpf, apt);

        controller.cadastrarMorador(morador);

        System.out.println("---------------------------------------------------------");
        System.out.println("Morador " + morador.getNome() + " registrado com sucesso!");
        System.out.println("---------------------------------------------------------");

        return morador;
    }
}