package Entidades;

import Entidades.Animal;
public class Cachorro extends Animal {
    private String _nome;
    private String _raca;
    private int _idade;

    public Cachorro(String nome, String raca, int idade, String tipo, String habitat) {
        super(tipo, habitat);
        this._nome = nome;
        this._raca = raca;
        this._idade = idade;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getRaca() {
        return _raca;
    }

    public void setRaca(String raca) {
        this._raca = raca;
    }

    public int getIdade() {
        return _idade;
    }

    public void setIdade(int idade) {
        this._idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro("+ "Id: " + getId() + "Nome: " + _nome + ", Raça: " + _raca + ", Idade: " + _idade + ", Tipo: " + getTipo() + ", Habitat: " + getHabitat() + ")";
    }
}
