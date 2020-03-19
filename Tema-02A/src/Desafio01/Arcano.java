package Desafio01;

public class Arcano extends Personagem {

    double mana;

    protected Arcano(String nome, double vida, double ataque, double defesa, double mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    public double getMana () {
        return mana;
    }


    public void imprimirEstado() {

        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    public void atacarMagia(Personagem alvo, Magia magia) {

        if (this.vida <= 0){

            System.out.println(this.nome + " está morto e, por isso, está impossibilitado de atacar");
        }

        if (this.vida > 0 && this.mana >= magia.custoDeMana) {

            double dano = calcularDano(alvo.defesa, magia.poderDeAtaque);
            alvo.vida = alvo.vida - dano;
            this.mana = this.mana - magia.custoDeMana;
            registrar(alvo.nome, magia.nome, dano);

            System.out.println("Nome: " + alvo.nome + " | Vida: " + alvo.vida);
        }
        if (this.mana < magia.custoDeMana){
            System.out.println(this.nome + " possui " + this.mana + " de mana. O custo de mana do ataque é " + magia.custoDeMana + " e, portanto, não será possível realizar o ataque.");
            this.mana = this.mana + 5;
            System.out.println("O personagem " + this.nome + " ganhou 5 pontos de mana.");
            System.out.println("Nome: " + this.nome + " | Novo Mana: " + this.mana);
        }

            if (alvo.vida <= 0) {
                System.out.println(alvo.nome + " morreu!");
            }




    }
}