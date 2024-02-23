package Entidades;

import Entidades.Base.Entidade;

public class Pessoa extends Entidade {
    private String _nome;
    private String _idade;
    private String _sexo;

    public Pessoa(String nome, String idade, String sexo) {
        this._nome = nome;
        this._idade = idade;
        this._sexo = sexo;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getIdade() {
        return _idade;
    }

    public void setIdade(String idade) {
        this._idade = idade;
    }

    public String getSexo() {
        return _sexo;
    }

    public void setSexo(String sexo) {
        this._sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa(" + "Id: " + Id + "Nome: " + _nome + ", Idade: " + _idade + ", Sexo: " + _sexo + ")";
    }
}