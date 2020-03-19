package Desafio01;

public class Sacerdote extends Personagem {

    double fe;

    protected Sacerdote(String nome, double vida, double ataque, double defesa, double fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public double getFe() {
        return fe;
    }


    public void imprimirEstado() {

        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

    public void atacarPoderDivino(Personagem alvo, PoderDivino poderDivino) {

        if (this.vida <= 0) {

            System.out.println(this.nome + " está morto e, por isso, está impossibilitado de atacar");
        }

        if (this.vida > 0 && this.fe >= poderDivino.custoDeFe) {

            double dano = calcularDano(alvo.defesa, poderDivino.intensidade);
            alvo.vida = alvo.vida - dano;
            this.fe = this.fe - poderDivino.custoDeFe;
            registrar(alvo.nome, poderDivino.nome, dano);

            System.out.println("Nome: " + alvo.nome + " | Vida: " + alvo.vida);
        }

        if (this.fe < poderDivino.custoDeFe) {
            System.out.println(this.nome + " possui " + this.fe + " de fé. O custo de fé do ataque é " + poderDivino.custoDeFe + " e, portanto, terá de ir mais a missa e não terá seu ataque validado.");
            this.fe = this.fe + 5;
            System.out.println("O personagem " + this.nome + " ganhou 5 pontos de fé.");
            System.out.println("Nome: " + this.nome + " | Nova Fé: " + this.fe);
        }

        if (alvo.vida <= 0) {
            System.out.println(alvo.nome + " morreu!");
        }
    }


}


