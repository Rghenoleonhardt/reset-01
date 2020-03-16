package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {

    public static void main(String[] args) {


        Produto produto1 = new Produto("OMO", SegmentoDoProduto.LIMPEZA, 38.90, 2);
        Produto produto2 = new Produto("Downy", SegmentoDoProduto.LIMPEZA, 19.90, 2);
        Produto produto3 = new Produto("Chocolate Alpino", SegmentoDoProduto.ALIMENTACAO, 6.99, 1);
        Produto produto4 = new Produto("Sabonete Dove", SegmentoDoProduto.HIGIENE, 2.19, 10);
        Produto produto5 = new Produto("Creme Dental", SegmentoDoProduto.HIGIENE, 7.89, 2);
        Produto produto6 = new Produto("Pão", SegmentoDoProduto.ALIMENTACAO, 6.99, 1);


        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);

        for (Produto produto : produtos){
            double valorTotal = produto.getValorDoProduto() * produto.getQuantidade();
            System.out.println("[" + produto.getSegmento() + "] - " + produto.getNomeDoProduto() + " (" + produto.getQuantidade() + ") - " + produto.getValorDoProduto() + " | " + valorTotal );
        }
    }



}
