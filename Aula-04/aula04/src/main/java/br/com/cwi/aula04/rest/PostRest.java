package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")

public class PostRest {

    private int contador =1;

    private List<Post> listaDePosts = new ArrayList<>();

    @GetMapping
    public List<Post> all() {
        return listaDePosts;
    }

    @GetMapping("/{id}")
    public Post one(@PathVariable("id") int id) {

        for (Post post : listaDePosts) {
            if (post.getId() == id) {

                return post;
            }
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {

        Post postParaSerDeletado = one(id);

        if (postParaSerDeletado != null) {

            listaDePosts.remove(postParaSerDeletado);
        }
    }

    @PostMapping
    public Post create(@RequestBody Post requestBody){

        requestBody.setId(contador);
        contador ++;

        listaDePosts.add(requestBody);

        return requestBody;
    }

    @PutMapping("/{id}")
    public Post update(@PathVariable("id") int id,@RequestBody Post requestBody){

        Post postParaSerAtualizado = one(id);

        if(postParaSerAtualizado != null){

            postParaSerAtualizado.setUserId(requestBody.getUserId());
            postParaSerAtualizado.setTitle(requestBody.getTitle());
            postParaSerAtualizado.setBody(requestBody.getBody());

            return postParaSerAtualizado;
        }
    }
}
