package br.com.cwi.tinderevolution.console;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        MusicaMenu musicaMenu = new MusicaMenu();
        FilmeMenu filmeMenu = new FilmeMenu();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nMostre um pouco mais sobre você. Coloque nesta seção os seus gostos para variados assuntos e/ou curiosidades a seu respeito.");
            System.out.println("\nSelecione o que você gostaria de adicionar:");
            System.out.println("[ M ] Música");
            System.out.println("[ F ] Filme");
            System.out.println("[ S ] Série");
            System.out.println("[ E ] Esporte");
            System.out.println("[ C ] Curiosidade");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'M':
                    musicaMenu.opcoes();
                    break;
                case 'F':
                    filmeMenu.opcoes();
                    break;
                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }
}