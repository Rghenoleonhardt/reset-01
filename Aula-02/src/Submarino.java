public class Submarino extends Aquatico {

    public Submarino (String nome, String terreno, String combustivel, int velocidadeMaxima, int lotacaoMaxima, double profundidadeMaxima){

        super(nome, terreno, combustivel, velocidadeMaxima,lotacaoMaxima, profundidadeMaxima);

    }

    @Override
    public String toString() {
        return "Submarino{" +
                "profundidadeMaxima=" + profundidadeMaxima +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
