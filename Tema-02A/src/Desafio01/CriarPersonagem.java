package Desafio01;

import java.util.List;
import java.util.Scanner;

public class CriarPersonagem {

    void novoPersonagem(List<HomemDeArma> homensDeArma, List<Arcano> arcanos, List<Sacerdote> sacerdotes) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escolha a classe do personagem e defina seus atributos:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Bárbaro");
        System.out.println("3 - Feiticeiro");
        System.out.println("4 - Mago");
        System.out.println("5 - Clerigo");
        System.out.println("6 - Druida");

        System.out.println(" ");
        System.out.print("Classe: ");
        char tipo = in.next().charAt(0);
        System.out.print("Nome: ");
        String nome = in.next();
        System.out.print("Vida: ");
        double vida = in.nextDouble();
        System.out.print("Ataque: ");
        double ataque = in.nextDouble();
        System.out.print("Defesa: ");
        double defesa = in.nextDouble();

        double fe;
        double mana;

        switch (tipo) {

            case '1':
                Guerreiro guerreiro = new Guerreiro(nome, vida, ataque, defesa);
                System.out.println("-------------------------------------------------------------------------------");
                homensDeArma.add(guerreiro);
                break;
            case '2':
                Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa);
                System.out.println("-------------------------------------------------------------------------------");
                homensDeArma.add(barbaro);
                break;
            case '3':
                System.out.print("Mana: ");
                mana = in.nextInt();
                Feiticeiro feiticeiro = new Feiticeiro(nome, vida, ataque, defesa, mana);
                System.out.println("-------------------------------------------------------------------------------");
                arcanos.add(feiticeiro);
                break;
            case '4':
                System.out.print("Mana: ");
                mana = in.nextInt();
                Mago mago = new Mago(nome, vida, ataque, defesa, mana);
                System.out.println("-------------------------------------------------------------------------------");
                arcanos.add(mago);
                break;
            case '5':
                System.out.print("Fé: ");
                fe = in.nextInt();
                Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, fe);
                System.out.println("-------------------------------------------------------------------------------");
                sacerdotes.add(clerigo);
                break;
            case '6':
                System.out.print("Fé: ");
                fe = in.nextInt();
                Druida druida = new Druida(nome, vida, ataque, defesa, fe);
                System.out.println("-------------------------------------------------------------------------------");
                sacerdotes.add(druida);
                break;
        }
    }
}

