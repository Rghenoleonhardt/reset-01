public class Trem extends Terrestre {

    public Trem (String nome, String terreno, String combustivel, int velocidadeMaxima, int lotacaoMaxima, int numeroDeRodas){

        super(nome, terreno, combustivel, velocidadeMaxima, lotacaoMaxima, numeroDeRodas);

    }

    @Override
    public String toString() {
        return "Trem{" +
                "numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
