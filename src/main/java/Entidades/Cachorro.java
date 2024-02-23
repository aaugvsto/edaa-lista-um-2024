package Entidades;

import Entidades.Interfaces.ICachorro;

public class Cachorro extends Animal implements ICachorro {
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

    public void Latir(){
        System.out.println("Cachorro Latindo*\nAU AU AU!");
    }

    public void PegarBolinha(){
        System.out.println("*Cachorro pegou a bolinha*");
    }

    public void Dormir(){
        System.out.println("*Cachorro dormiu*");
    }

    public void Acordar(){
        System.out.println("*Cachorro Acordou*");
    }

    public void Comer(){
        System.out.println("*Cachorro comendo*");
    }

    public void BeberAgua(){
        System.out.println("*Cachorro bebendo agua*");
    }

    @Override
    public String toString() {
        return "Cachorro("+ "Id: " + getId() + "Nome: " + _nome + ", Raça: " + _raca + ", Idade: " + _idade + ", Tipo: " + getTipo() + ", Habitat: " + getHabitat() + ")";
    }
}
