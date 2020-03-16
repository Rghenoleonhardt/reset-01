package exercicio4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        Evento aulaReset = new Evento("Aula de programação", "CWI Software", LocalDateTime.of(2020, 03,21, 8,30));
        Evento aulaReset2 = new Evento("Final do Curso de programação", "CWI Software", LocalDateTime.of(2020, 03, 28, 8, 30));


        Duration tempoRestante = Duration.between(LocalDateTime.now(), aulaReset.getDataEHora());

        Duration tempoRestante2 = Duration.between(LocalDateTime.now(), aulaReset2.getDataEHora());

        String dataFormatada = aulaReset.getDataEHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        String dataFormatada2 = aulaReset2.getDataEHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        long dias = tempoRestante.toDays();

        long dias2 = tempoRestante2.toDays();


        System.out.println(dataFormatada + " - " + aulaReset.getDescricao() + " (" + aulaReset.getLocal() + ") - Faltam " + dias + " dias.");

        System.out.println(dataFormatada2 + " - " + aulaReset2.getDescricao() + " (" + aulaReset2.getLocal() + ") - Faltam " + dias2 + " dias.");
    }

}
