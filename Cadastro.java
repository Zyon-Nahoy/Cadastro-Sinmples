package Gurilo;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Cadastro {

    private String nome;
    private String cpf;
    private String tipoSanguineo;
    private String idade;
    private String genero;





    public Cadastro(String nome, String genero, String cpf, String tipoSanguineo, String idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoSanguineo = tipoSanguineo;
        this.idade = idade;
        this.genero = genero;
    }



    public static void criarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de cadastros: ");
        int quantidadeCadastros = scanner.nextInt();
        scanner.nextLine();

        Cadastro[] cadastros = new Cadastro[quantidadeCadastros];

        for (int i = 0; i < quantidadeCadastros; i++) {
            System.out.println("Cadastro " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Genero: ");
            String genero = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Tipo sanguíneo: ");
            String tipoSanguineo = scanner.nextLine();
            System.out.print("Idade: ");
            String idade = scanner.nextLine();

            cadastros[i] = new Cadastro(nome, genero, cpf, tipoSanguineo, idade);
        }


        for (Cadastro cadastro : cadastros) {
            System.out.println("Cliente: " + cadastro);
        }

        try (FileWriter writer = new FileWriter("cadastros.csv")) {
            // Escreve o cabeçalho do arquivo
            writer.append("Nome,CPF,Tipo Sanguíneo\n");

            for (Cadastro cadastro : cadastros) {
                // Escreve os dados de cada cadastro em uma nova linha
                writer.append(cadastro.nome + "," + cadastro.cpf + "," + cadastro.tipoSanguineo + "," + cadastro.idade + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

    }




}