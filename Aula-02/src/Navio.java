public class Navio extends Aquatico {

    public Navio (String nome, String terreno, String combustivel, int velocidadeMaxima, int lotacaoMaxima, double profundidadeMaxima){

        super(nome, terreno, combustivel, velocidadeMaxima, lotacaoMaxima, profundidadeMaxima);

    }

    @Override
    public String toString() {
        return "Navio{" +
                "profundidadeMaxima=" + profundidadeMaxima +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
