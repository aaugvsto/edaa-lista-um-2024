package Entidades;

import Entidades.Base.Entidade;

public class Livro extends Entidade {
    private String _titulo;
    private String _autor;
    private String _editora;
    private String _genero;

    public Livro(String titulo, String autor, String editora, String genero) {
        this._titulo = titulo;
        this._autor = autor;
        this._editora = editora;
        this._genero = genero;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String titulo) {
        this._titulo = titulo;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String autor) {
        this._autor = autor;
    }

    public String getEditora() {
        return _editora;
    }

    public void setEditora(String editora) {
        this._editora = editora;
    }

    public String getGenero() {
        return _genero;
    }

    public void setGenero(String genero) {
        this._genero = genero;
    }

    @Override
    public String toString() {
        return "Livro(Id: " + Id  + ", Título: " + _titulo + ", Autor: " + _autor + ", Editora: " + _editora + ", Gênero: " + _genero + ")";
    }
}