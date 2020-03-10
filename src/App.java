public class App {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Minha nossa!");
        System.out.println("Grêmio campeão gauchão");
        System.out.println("Coudet não treina nada");

        //Exercício 01 de classes//

        Calculadora calculadoraDeIdades = new Calculadora(); //calculadoraDeIdades é o objeto baseado na classe calculadora//
        int somaDasIdades = calculadoraDeIdades.somar(33, 54); //somar, subtrair, multiplicar, dividir são métodos//
        System.out.println(somaDasIdades);

        int subtraçãoDasIdades = calculadoraDeIdades.subtrair(33, 54);
        System.out.println(subtraçãoDasIdades);

        int multiplicaçãoDasIdades = calculadoraDeIdades.multiplicar(33, 54);
        System.out.println(multiplicaçãoDasIdades);

        int divisãoDasIdades = calculadoraDeIdades.dividir(33, 54);
        System.out.println(divisãoDasIdades);


        //Exercício 02 de classes//

        Comparador comparacaoDeIdades = new Comparador(); //comparacaoDeIdades é o objeto baseado na classe comparador//
        boolean comparacaoIdades = comparacaoDeIdades.menorQue(67, 32);// menorQue é um método//
        System.out.println(comparacaoIdades);


        //Exercício 03 de classes//


    }
}
