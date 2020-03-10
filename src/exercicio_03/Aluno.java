package exercicio_03;

public class Aluno {

    String nome;

    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    boolean maiorQue (double notaMinima){
        return nota >= notaMinima;
    }
}
