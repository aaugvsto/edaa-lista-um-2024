package Entidades;

import Entidades.Base.Entidade;
public abstract class Animal extends Entidade {
    private String _tipo;
    private String _habitat;

    public Animal(String tipo, String habitat) {
        this._tipo = tipo;
        this._habitat = habitat;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String tipo) {
        this._tipo = tipo;
    }

    public String getHabitat() {
        return _habitat;
    }

    public void setHabitat(String habitat) {
        this._habitat = habitat;
    }
}