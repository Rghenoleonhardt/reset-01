package Desafio01;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.time.LocalDateTime;

public class AppCombate {

    public static void main(String[] args) {


        //LISTA DE TODOS OS PERSONAGENS//
        List<HomemDeArma> homensDeArmas = new ArrayList<>();
        List<Arcano> arcanos = new ArrayList<>();
        List<Sacerdote> sacerdotes = new ArrayList<>();

        //DADOS DE ENTRADA: ARMAS, PODEDERES E MAGIAS COM SEUS RESPECTIVOS "STATUS"
        Arma faca = new Arma("faca", 2.5);
        Arma chakram = new Arma("Chakram", 3);
        PoderDivino oNegocio = new PoderDivino("O negócio", 2, 24);
        PoderDivino ergueiAsMaos = new PoderDivino("Erguei as mãos e dai glória a Deusssss", 4, 110);
        PoderDivinoEmArea abrirMarVermelho = new PoderDivinoEmArea("Abra, Mar Vermelho", 2, 2);
        Magia snake = new Magia("Pegadinha da Cobra", 4, 30);
        Magia sangue = new Magia("Sangue Sagrado", 5, 40);
        MagiaEmArea tapete = new MagiaEmArea("Tapete Insano do Alladin", 3, 3);

        //INÍCIO DA PARTIDA//
        System.out.println(" ");
        System.out.println("                               COMBATE FINAL                                ");
        System.out.println(" ");
        System.out.println("--------------------Por favor, criar 6 personagens para iniciar o jogo!--------------------");
        System.out.println(" ");

        //SET UP PERSONAGENS
        CriarPersonagem criacao = new CriarPersonagem();

        //CONTADOR DE CRIAÇÃO
        int contadorDePersonagem = 0;
        while (contadorDePersonagem < 6) {
            criacao.novoPersonagem(homensDeArmas, arcanos, sacerdotes);
            contadorDePersonagem++;
        }

        //PERSONAGENS CRIADOS
        HomemDeArma personagem1 = homensDeArmas.get(0);
        HomemDeArma personagem2 = homensDeArmas.get(1);
        Arcano personagem3 = arcanos.get(0);
        Arcano personagem4 = arcanos.get(1);
        Sacerdote personagem5 = sacerdotes.get(0);
        Sacerdote personagem6 = sacerdotes.get(1);

        List<Personagem> alvosHomemDeArmas = new ArrayList<>();
        alvosHomemDeArmas.add(personagem1);
        alvosHomemDeArmas.add(personagem2);
        List<Personagem> alvosArcanos = new ArrayList<>();
        alvosArcanos.add(personagem3);
        alvosArcanos.add(personagem4);
        List<Personagem> alvosSacerdotes = new ArrayList<>();
        alvosSacerdotes.add(personagem5);
        alvosSacerdotes.add(personagem6);

        //ATAQUES REGISTRADOS
        List<String> registros = new ArrayList<>();

        //DATA E HORA
        LocalDateTime horaInicial = LocalDateTime.now();

        //COMBATE
        personagem3.atacarMagia(personagem5, snake);
        personagem6.atacarPoderDivino(personagem2, ergueiAsMaos);
        personagem5.atacarPoderDivino(alvosArcanos, abrirMarVermelho);
        personagem2.equipar(chakram);
        personagem2.atacarArmas(personagem1, null);
        personagem4.atacarMagia(alvosSacerdotes, tapete);
        personagem2.equipar(faca);
        personagem2.atacarArmas(personagem3, null);
        personagem6.atacarPoderDivino(personagem2, ergueiAsMaos);
        personagem1.equipar(faca);
        personagem1.atacarArmas(personagem2, null);
        personagem5.atacarPoderDivino(personagem4, oNegocio);
        personagem3.atacarMagia(personagem5, snake);
        personagem1.equipar(chakram);
        personagem1.atacarArmas(personagem3, null);
        personagem4.atacarMagia(personagem6, sangue);


    }
}






