package exercicio4;

import java.time.LocalDateTime;

public class Evento {

    private String descricao;
    private String local;
    private LocalDateTime dataEHora;

    public Evento(String descricao, String local, LocalDateTime dataEHora) {
        this.descricao = descricao;
        this.local = local;
        this.dataEHora = dataEHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }
}
