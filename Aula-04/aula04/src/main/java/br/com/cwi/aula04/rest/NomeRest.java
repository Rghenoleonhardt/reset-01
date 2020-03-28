package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.InformacaoProjeto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meuNome")

public class NomeRest {

public String nome;

    @GetMapping
    public String meuNome() {
        return "Meu nome é " + nome;
    }


    @GetMapping("{nome}")
    public String meuNomeComParametros(@PathVariable("nome") String nomeDoUsuario) {
        return "Meu nome é " + nomeDoUsuario;
    }

    @PutMapping
    public String editarNome(@RequestBody String nome){
        this.nome = nome;
        return this.nome;
    }

    @DeleteMapping
    public void deleteNome(){
        this.nome = null;
    }
}


