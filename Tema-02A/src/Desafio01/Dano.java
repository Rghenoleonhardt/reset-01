package Desafio01;

public class Dano extends Personagem {

    public Dano(String nome, double vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void calcularDano(Personagem alvo, Arma arma) {

        if (this.vida > 0) {

            double dano = calcularDano(alvo.ataque, arma.poderDeAtaque);
            alvo.vida = alvo.vida - dano;
            registrar(alvo.nome, arma.nome, dano);

            if (alvo.vida <= 0) {
                System.out.println(alvo.nome + " morreu!");
            }
        }
        else {
            System.out.println(this.nome + " está morto e, por isso, não conseguirá realizar mais nenhum ataque!");
        }

    }
}
