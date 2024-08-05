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

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public Animal(String nome, int idade, String especie) {
    this.nome = nome;
    this.especie = especie;
    this.idade = idade;
  }

  // Sobrecarga
  public Animal(String nome) {
    this.nome = nome;
  }

  public abstract void emitirBarulho();

  public boolean ehAdulto() {
    return idade >= 1;
  }

}
