package exercicio_03;

public class App3 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Rômulo", 9.8);

        System.out.println("Nome do Aluno: " + aluno.nome);
        System.out.println("Nota do Aluno: " + aluno.nota);

        boolean alunoAprovado = aluno.maiorQue( 7.0);
        System.out.println("O aluno está aprovado? (Sim - true , Não - false): " + alunoAprovado);


        Aluno outroAluno = new Aluno("Neto", 2);
        boolean aprovado = outroAluno.maiorQue(7);
        System.out.println("Aluno " + outroAluno.nome + " com nota final " + outroAluno.nota + " esta " + aprovado);

    }

}
