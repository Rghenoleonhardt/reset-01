package Desafio01;

public class HomemDeArma extends Personagem {

    Arma arma;

    protected HomemDeArma(String nome, double vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
    }


    public void imprimirEstado() {

        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);

    }

    public void atacarArmas(Personagem alvo, Arma arma) {

        if (this.vida <= 0) {

            System.out.println(this.nome + " está morto e, por isso, está impossibilitado de atacar");
        }

        if (this.vida > 0) {

            double dano = calcularDano(alvo.defesa, arma.poderDeAtaque);
            alvo.vida = alvo.vida - dano;
            registrar(alvo.nome, arma.nome, dano);

            System.out.println("Nome: " + alvo.nome + " | Vida: " + alvo.vida);
        }

        if (alvo.vida <= 0) {
            System.out.println(alvo.nome + " morreu!");
        }

    }

    void equipar(Arma armaUtilizada) {
        this.arma = armaUtilizada;
    }
}

