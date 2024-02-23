package Entidades;

import java.util.List;
import java.util.stream.Collectors;

public class Aluno extends Pessoa {
    private String _curso;
    private String _matricula;
    private List<Disciplina> _disciplinas;

    public Aluno(String nome, String idade, String sexo, String curso, String matricula, List<Disciplina> disciplinas) {
        super(nome, idade, sexo);
        this._curso = curso;
        this._matricula = matricula;
        this._disciplinas = disciplinas;
    }

    public String getCurso() {
        return _curso;
    }

    public void setCurso(String curso) {
        this._curso = curso;
    }

    public String getMatricula() {
        return _matricula;
    }

    public void setMatricula(String matricula) {
        this._matricula = matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return _disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this._disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        String disciplinasConcatenadas = _disciplinas.stream()
                .map(Disciplina::getNome)
                .collect(Collectors.joining(", "));
        return String.format("Aluno(Id: %s, Nome: %s, Idade: %s, Sexo: %s, Curso: %s, Matrícula: %s, Disciplinas: %s)",
                getId(), getNome(), getIdade(), getSexo(), getCurso(), getMatricula(), disciplinasConcatenadas);
    }
}