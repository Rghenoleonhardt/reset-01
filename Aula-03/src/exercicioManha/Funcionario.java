package exercicioManha;

import java.util.Scanner;

public class Funcionario {

    private static int totalFuncionarios = 0;

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        totalFuncionarios++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getRemuneracaoMensal() {
        return this.salario;
    }
}

    /*public void receberDados(){

        System.out.println("Nome: ");
        String nome = lerString();

        System.out.println("CPF: ");
        String cpf = lerString();

        System.out.println("Salário: ");
        double salario = lerDouble();
    }

    private static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String lerString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static double lerDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }*/



