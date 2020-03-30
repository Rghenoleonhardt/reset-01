package br.com.cwi.tinderevolution.console;

import br.com.cwi.tinderevolution.dominio.CategoriaFilme;
import br.com.cwi.tinderevolution.dominio.Filme;
import br.com.cwi.tinderevolution.gerenciador.FilmeGerenciador;

import java.time.LocalDate;
import java.util.Scanner;

public class FilmeMenu {

    private FilmeGerenciador gerenciador;

    public FilmeMenu() { this.gerenciador = new FilmeGerenciador(); }

    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while(opcao != 'X'){

            System.out.println("\nSelecione uma opção");
            System.out.println("[ C ] Criar;");
            System.out.println("[ E ] Editar;");
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Procurar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar");
            System.out.println("> ");
            opcao = scanner.next().charAt(0);

            switch(opcao){

                case 'C':
                    create();
                    break;
                case 'E':
                    editar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case "X":
                    System.out.println("...");
                    break;
                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }

    private Filme inserirDadosFilme(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Título: ");
        String titulo = scanner.nextLine();

        System.out.println("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.println("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento: ");
        int mes = scanner.nextInt();

        System.out.println("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("\n[ D ] Drama;");
        System.out.println("[ C ] Comédia;");
        System.out.println("[ S ] Suspense;");
        System.out.println("[ T ] Terror;");
        System.out.println("[ A ] Ação;");
        System.out.println("[ I ] Sitcom.");
        System.out.println("> ");
        String categoria = scanner.next();

        CategoriaFilme categoriaFilme;
        switch (categoria){
            case "D":
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case "C":
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case "S":
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case "T":
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case "A":
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case "I":
                categoriaFilme = CategoriaFilme.SITCOM;
            default:
                categoriaFilme = CategoriaFilme.SITCOM;
                break;
        }

        System.out.println("Sinopse: ");
        String sinopse = scanner.next();

        Filme filme = new Filme(titulo, diretor,LocalDate.of(ano,mes,dia),categoriaFilme, sinopse);
        return filme;
    }

}
