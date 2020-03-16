public class Terrestre extends Veiculo {

    int numeroDeRodas;

    public Terrestre (String nome, String terreno, String combustivel, int velocidadeMaxima, int lotacaoMaxima, int numeroDeRodas) {
        super(nome, terreno,combustivel, velocidadeMaxima, lotacaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
    }
}
