package Entidades;
import java.time.LocalDate;

public class Professor extends Pessoa {
    private String _departamento;
    private LocalDate _dataAdmissao;
    private Integer _salario;

    public Professor(String nome, String idade, String sexo, String departamento, LocalDate dataAdmissao, Integer salario) {
        super(nome, idade, sexo);
        this._departamento = departamento;
        this._dataAdmissao = dataAdmissao;
        this._salario = salario;
    }

    public String getDepartamento() {
        return _departamento;
    }

    public void setDepartamento(String departamento) {
        this._departamento = departamento;
    }

    public LocalDate getDataAdmissao() {
        return _dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this._dataAdmissao = dataAdmissao;
    }

    public Integer getSalario() {
        return _salario;
    }

    public void setSalario(Integer salario) {
        this._salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Professor(Id: %s, Nome: %s, Idade: %s, Sexo: %s, Departamento: %s, Data de Admissão: %s, Salário: %s)",
                getId(), getNome(), getIdade(), getSexo(), getDepartamento(), getDataAdmissao(), getSalario());
    }
}
