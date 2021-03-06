package br.com.cwi.tinderevolution.gerenciador;

import br.com.cwi.tinderevolution.acervo.FilmeAcervo;
import br.com.cwi.tinderevolution.dominio.Filme;

import java.time.LocalDate;
import java.util.List;

public class FilmeGerenciador {

    private FilmeAcervo acervo = new FilmeAcervo();

    public Filme salvar(Filme filme){

        List<Filme> filmes = acervo.listar();

        for(Filme filmeExistente : filmes) {
            if(filme.getTitulo().equals(filmeExistente.getTitulo())){
                return filmeExistente;
            }
        }

        if(filme.getTitulo().isEmpty() || filme.getDiretor().isEmpty() || filme.getCategoriaFilme() == null || filme.getLancamento() == null || filme.getSinopse().isEmpty()){
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        if(filme.getLancamento().isAfter(LocalDate.now())){
            return null;
        }

        return acervo.salvar(filme);

    }

    public Filme editar(int id, Filme filmeAtualizado){

        Filme filmeParaEditar = procurar(id);

        if(filmeParaEditar == null){
            return null;
        } else {
            return acervo.editar(filmeParaEditar, filmeAtualizado);
        }
    }

    public List<Filme> listar(){ return acervo.listar();}

    public Filme procurar(int id){

        if(id > 0){
            return acervo.procurar(id);
        }

        return null;
    }

    public boolean deletar(int id){
        if(id > 0){
            return acervo.deletar(id);
        }

        return false;
    }
}
