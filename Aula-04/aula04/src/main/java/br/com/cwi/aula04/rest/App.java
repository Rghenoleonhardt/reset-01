package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.Post;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        PostRest rest = new PostRest();
        Scanner scanner = new Scanner(System.in);

        System.out.println("API de Posts");

        System.out.println("Digita um id de Post para pesquisar: ");
        int id = scanner.nextInt();

        Post postPesquisado = rest.one(id);
        System.out.println("Post encontrado " + postPesquisado);

        System.out.println();

    }
}
