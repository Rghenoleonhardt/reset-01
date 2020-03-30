package br.com.cwi.tinderevolution.dominio;

import java.time.LocalDate;

public class Filme {

    private int id;

    private String titulo;

    private String diretor;

    private LocalDate lancamento;

    private CategoriaFilme categoriaFilme;

    private String sinopse;

    public Filme(String titulo, String diretor, LocalDate lancamento, CategoriaFilme categoriaFilme, String sinopse){
        this.titulo = titulo;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.categoriaFilme = categoriaFilme;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public CategoriaFilme getCategoriaFilme() {
        return categoriaFilme;
    }

    public void setCategoriaFilme(CategoriaFilme categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filme {" +
                "id: " + id +
                ", título: '" + titulo + '\'' +
                ", diretor: '" + diretor + '\'' +
                ", categoria do filme: " + categoriaFilme +
                ", lançamento: " + lancamento + "Sinopse: " + sinopse +
                '}';
    }
}
