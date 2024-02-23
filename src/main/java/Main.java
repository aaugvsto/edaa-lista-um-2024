import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Entidades.*;

public class Main {
    public static void main(String[] args) {
        // Letra A
        System.out.println("Letra A\n");
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", "Fantasia");
        System.out.println(livro + "\n");

        // Letra B
        System.out.println("Letra B\n");
        Pessoa pessoa = new Pessoa("Fulano", "25", "Masculino");
        System.out.println(pessoa + "\n");

        // Letra C
        System.out.println("Letra C\n");

        Professor professor = new Professor("Ciclano", "35", "Masculino", "Ciência da Computação", LocalDate.of(2024, 02, 22), 5000);

        Disciplina disciplina = new Disciplina("Analise de dados e Algoritmos", 120);
        List<Disciplina> disciplinasAluno = new ArrayList<Disciplina>();
        disciplinasAluno.add(disciplina);

        Aluno aluno = new Aluno("Beltrano", "20", "Masculino", "Ciência da Computação", "20210001", disciplinasAluno);

        System.out.println(professor + "\n");
        System.out.println(disciplina + "\n");
        System.out.println(aluno + "\n");

        // Letra D
        System.out.println("Letra D\n");
        Cachorro cachorro = new Cachorro("Rex", "Vira-lata", 5, "Doméstico", "Casa");
        System.out.println(cachorro + "\n");

        System.out.println("Aplicação encerrada!");
    }
}

