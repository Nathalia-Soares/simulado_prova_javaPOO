import classes.Pais;

import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- Cadastro de país #1---");
        System.out.println("Digite o nome do país: ");
        String nome = input.next();
        System.out.println("Digite a capital do país: ");
        String capital = input.next();
        System.out.println("Digite a dimensão (em Km) do país: ");
        int dimensao = input.nextInt();
        System.out.println("Com quantos países o/a " + nome + " faz fronteira?");
        int quantFronteira = input.nextInt();
        String[] paisFronteira = new String[quantFronteira];
        System.out.println("Digite os países que fazem fronteira com o/a " + nome);
        for (int i = 0; i < quantFronteira; i++) {
            String fronteira = input.next();
            paisFronteira[i] = fronteira;
        }

        System.out.println("--- Cadastro de país #2---");
        System.out.println("Digite o nome do país: ");
        String nome2 = input.next();
        System.out.println("Digite a capital do país: ");
        String capital2 = input.next();
        System.out.println("Digite a dimensão (em Km) do país: ");
        int dimensao2 = input.nextInt();
        System.out.println("Com quantos países o/a " + nome2 + " faz fronteira?");
        int quantFronteira2 = input.nextInt();
        String[] paisFronteira2 = new String[quantFronteira2];
        System.out.println("Digite os países que fazem fronteira com o/a " + nome2);
        for (int i = 0; i < quantFronteira2; i++) {
            String fronteira2 = input.next();
            paisFronteira2[i] = fronteira2;
        }

        Pais pais1 = new Pais(nome, capital, dimensao, paisFronteira);
        Pais pais2 = new Pais(nome2, capital2, dimensao2, paisFronteira2);

        System.out.println("--- Menu de opcoes ---");
        System.out.println("Digite: ");
        System.out.println("1) Para verificar se dois países são iguais; ");
        System.out.println("2) Para verificar se um país faz fronteira com outro; ");
        System.out.println("3) Para mostrar a lista de vizinhos em comum entre dois países; ");

        int opcoes;
        opcoes =input.nextInt();

        switch (opcoes) {
            case (1) -> pais1.paisesIguais(pais1, pais2);
            case (2) -> pais1.paisLimitrofe(pais1, pais2);
            case (3) -> pais1.listaVizinhos(pais1, pais2);
            default -> System.out.println("Opção inválida!");
        }
        input.close();
    }
}
