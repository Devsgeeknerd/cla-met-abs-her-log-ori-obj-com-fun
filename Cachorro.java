package br.com.devsgeeknerd.zoologico.classes;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro(String nome, String especie, int idade) {
        super(nome, idade, especie);
    }
}
