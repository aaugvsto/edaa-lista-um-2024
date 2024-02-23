package Entidades;

import Entidades.Base.Entidade;

public class Disciplina extends Entidade {
    private String _nome;
    private Integer _cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this._nome = nome;
        this._cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public int getCargaHoraria() {
        return _cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this._cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina(Id: " + Id + ", Nome: " + _nome + ", Carga horária: " + _cargaHoraria + ")";
    }
}
