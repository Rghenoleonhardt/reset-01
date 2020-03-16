public class Aviao extends Aereo {

    public Aviao (String nome, String terreno, String combustivel, int velocidadeMaxima, int lotacaoMaxima, double altitudeMaxima) {
        super(nome, terreno, combustivel, velocidadeMaxima, lotacaoMaxima, altitudeMaxima);
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMaxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
