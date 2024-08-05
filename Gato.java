package br.com.devsgeeknerd.zoologico.classes;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public Gato(String nome, String especie, int idade) {
        super(nome, idade, especie);
    }

    public Gato(String nome, int idade) {
        super(nome, idade, "Gato");
    }

    @override
    public void emitirBarulho() {
        System.out.println("Miado do gato");
    }

}
