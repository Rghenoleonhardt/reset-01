package exercicio3;

public enum SegmentoDoProduto {

    ALIMENTACAO("ALIMENTAÇÃO"),
    LIMPEZA("LIMPEZA"),
    HIGIENE("HIGIENE"),
    ;

    private final String descricao;

    SegmentoDoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
