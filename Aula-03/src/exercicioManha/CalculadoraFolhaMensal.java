package exercicioManha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CalculadoraFolhaMensal {



    public static void main(String[] args) {
            System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");
            int opcao = 0;
            List<Funcionario> funcionarioList = new ArrayList<>();
            while (opcao != 9) {
                imprimeMenu();
                opcao = lerInteiro();
                if (opcao == 1) {
                    //Cadastra Engenheiro//


                    System.out.println("Nome do Engenheiro: ");
                    String nome = lerString();

                    System.out.println("CPF: ");
                    String cpf = lerString();

                    System.out.println("Salário: ");
                    double salario = lerDouble();

				Engenheiro eng = new Engenheiro(nome, cpf, salario);

				funcionarioList.add(eng);

                } else if (opcao == 2) {
                    // Cadastra Programador

                    System.out.println("Nome do programador: ");
                    String nome = lerString();

                    System.out.println("CPF: ");
                    String cpf = lerString();

                    System.out.println("Salário: ");
                    double salario = lerDouble();

                    System.out.println("Número de Certificações: ");
                    int numeroCertificacaoes = lerInteiro();

                    Programador prog = new Programador(nome, cpf, salario, numeroCertificacaoes);

                    funcionarioList.add(prog);

                } else if (opcao == 3) {
                    // Cadastra Gerente

                    System.out.println("Nome do Gerente: ");
                    String nome = lerString();

                    System.out.println("CPF: ");
                    String cpf = lerString();

                    System.out.println("Salário: ");
                    double salario = lerDouble();

                    System.out.println("Lucro no último ano: ");
                    double lucroUltimoAno = lerDouble();

                    Gerente ger = new Gerente(nome, cpf, salario, lucroUltimoAno);

                    funcionarioList.add(ger);
                }

                else {
                    System.out.println("----------- Opção invalida               -----------");
                    System.out.println("\n");
                }
            }
            // Calculo da folha mensal

        double totalDespesas = 0;
            for(Funcionario func : funcionarioList){
                totalDespesas += func.getRemuneracaoMensal();
            }

            System.out.println("A despesa total do mês é de " + totalDespesas + ".");

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
        }


        private static void imprimeMenu() {
            System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
            System.out.println("----------- 2 - Cadastro Programador             -----------");
            System.out.println("----------- 3 - Cadastro Gerente                 -----------");
            System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
        }
    }

