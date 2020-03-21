package Desafio01;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Personagem implements List<Personagem> {

    protected String nome;
    protected double vida;
    protected double ataque;
    protected double defesa;

    protected Personagem(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    double calcularDano(double defesa, double poder) {

        return ataque * poder - defesa;
    }

    void registrar(String nomeAlvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano");

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Personagem> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Personagem personagem) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Personagem> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Personagem> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Personagem get(int index) {
        return null;
    }

    @Override
    public Personagem set(int index, Personagem element) {
        return null;
    }

    @Override
    public void add(int index, Personagem element) {

    }

    @Override
    public Personagem remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Personagem> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Personagem> listIterator(int index) {
        return null;
    }

    @Override
    public List<Personagem> subList(int fromIndex, int toIndex) {
        return null;
    }
}
