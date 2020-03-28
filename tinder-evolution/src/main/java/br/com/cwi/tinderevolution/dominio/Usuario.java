package br.com.cwi.tinderevolution.dominio;

public class Usuario {

    private String nome;

    private Double latitudade; //null

    private Double longitude; //0

    public Usuario(String nome, Double latitudade, double longitude) {
        this.nome = nome;
        this.latitudade = latitudade;
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLatitudade() {
        return latitudade;
    }

    public void setLatitudade(Double latitudade) {
        this.latitudade = latitudade;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
