package br.com.devsgeeknerd.zoologico.classes.app;

import br.com.devsgeeknerd.zoologico.classes.Animal;
import br.com.devsgeeknerd.zoologico.classes.Cachorro;
import br.com.devsgeeknerd.zoologico.classes.Gato;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Toto");
        Gato gato = new Gato("Tata", 2);
        cachorro.setEspecie("Cachorro");
        cachorro.setIdade(2);

        System.out.println("Ola, seu animal é " + cachorro.getEspecie() + ", o nome do " + "animal é "
                + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos.");

        System.out.println("Ola, seu animal é " + gato.getEspecie() + ", o nome do " + "animal é " + gato.getNome()
                + " e ele tem " + gato.getIdade() + " anos.");
    }
}
