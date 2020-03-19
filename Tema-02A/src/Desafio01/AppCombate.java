package Desafio01;

public class AppCombate {

    public static void main(String[] args) {


        Guerreiro rambo = new Guerreiro("Rambo", 1000, 120, 5);
        Mago jafar = new Mago("Jafar", 1000, 180, 40, 100);
        Druida alex = new Druida("Frota", 1000, 100, 20, 100);

        Arma punhoDeAco = new Arma("Punho de Aço", 10);
        Magia snake = new Magia("Snake Catch", 4, 30);
        PoderDivino coisa = new PoderDivino("O negócio é...", 2, 24);

        rambo.atacarArmas(jafar, punhoDeAco);
        jafar.atacarMagia(alex, snake);
        alex.atacarPoderDivino(rambo, coisa);
        jafar.atacarMagia(rambo, snake);
        rambo.atacarArmas(alex, punhoDeAco);
        alex.atacarPoderDivino(rambo, coisa);
        jafar.atacarMagia(alex, snake);
        alex.atacarPoderDivino(jafar,coisa);

    }
}
