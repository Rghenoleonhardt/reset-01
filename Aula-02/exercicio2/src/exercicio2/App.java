package exercicio2;

public class App {

    public static void main(String[] args) {

        Livro oSenhorDosAneis = new Livro("O Senhor dos Anéis", "J.R.R Tolkien", Categoria.FANTASIA, Status.EMPRESTADO);
        Livro theEyeOfTheNeedle = new Livro("The Eye of the Needle", "Ken Follet", Categoria.SUSPENSE, Status.EMUSO);
        Livro meBeforeYou = new Livro("Me Before You", "Jojo Moyes", Categoria.ROMANCE, Status.DISPONIVEL);
        Livro it = new Livro("It", "Stephen King", Categoria.TERROR, Status.EMPRESTADO);

        System.out.println(oSenhorDosAneis);
        System.out.println("\n");
        System.out.println(theEyeOfTheNeedle);
        System.out.println("\n");
        System.out.println(meBeforeYou);
        System.out.println("\n");
        System.out.println(it);

    }

    }

