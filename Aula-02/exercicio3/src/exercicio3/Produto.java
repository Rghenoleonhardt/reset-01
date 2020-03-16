package exercicio3;

public class Produto {

    String nomeDoProduto;
    SegmentoDoProduto segmento;
    double valorDoProduto;
    int quantidade;

    public Produto(String nomeDoProduto, SegmentoDoProduto segmento, double valorDoProduto, int quantidade) {
        this.nomeDoProduto = nomeDoProduto;
        this.segmento = segmento;
        this.valorDoProduto = valorDoProduto;
        this.quantidade = quantidade;
    }
    public String getNomeDoProduto(){
        return nomeDoProduto;
    }

    public SegmentoDoProduto getSegmento(){
        return segmento;
    }

    public double getValorDoProduto(){
        return valorDoProduto;
    }

    public int getQuantidade(){
        return quantidade;
    }

}
