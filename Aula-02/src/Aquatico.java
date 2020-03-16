public class Aquatico extends Veiculo {


    double profundidadeMaxima;

    public Aquatico (String nome, String terreno, String combustivel, int velocidadeMaxima, int lotacaoMaxima, double profundidadeMaxima) {

        super(nome, terreno, combustivel, velocidadeMaxima, lotacaoMaxima);
        this.profundidadeMaxima = profundidadeMaxima;

    }
}
