public class Aereo extends Veiculo{

    double altitudeMaxima;

    public Aereo (String nome, String terreno, String combustivel, int velocidadeMaxima, int lotacaoMaxima, double altitudeMaxima) {
        super(nome, terreno, combustivel, velocidadeMaxima, lotacaoMaxima);
        this.altitudeMaxima = altitudeMaxima;
    }

}
