package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.InformacaoProjeto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")

public class HelloWorldRest {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/{ghenol}")
    public String holloWorldComParametros(@PathVariable("ghenol") String nomeDoUsuario) {
        return "Hello World, " + nomeDoUsuario;
    }

    @PostMapping
    public void salvaAlgumaCoisa(@RequestBody InformacaoProjeto informacaoProjeto){
        System.out.println("Salvando alguma coisa " + informacaoProjeto);
    }
}
