package br.com.devsgeeknerd.zoologico.classes;

public abstract class Animal {
  private String nome;
  private String especie;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecie() {
    return especie;
  }
}
