abstract class Animal {
  String _nome;
  String _especie;
  int _idade;

  Animal(this._nome, this._idade, this._especie);

  String get nome => _nome;
  set nome(String nome) => _nome = nome;

  String get especie => _especie;
  set especie(String especie) => _especie = especie;

  int get idade => _idade;
  set idade(int idade) => _idade = idade;

  // Abstract method
  void emitirBarulho();

  bool get ehAdulto => _idade >= 1;
}
