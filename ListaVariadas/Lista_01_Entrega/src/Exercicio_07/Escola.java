package Exercicio_07;

import java.util.ArrayList;
import java.util.List;

public class Escola
{
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Escola()
    {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    public void cadastroAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }

    public void cadastroProfessor(Professor professor)
    {
        professores.add(professor);
    }

    public void listarAlunos()
    {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos)
        {
            aluno.exibirInformacoes();
            System.out.println("-----------------------------------");
        }
    }

    public void listarProfessores()
    {
        System.out.println("Lista de Professores:");
        for (Professor professor : professores) {
            professor.exibirInformacoes();
            System.out.println("-----------------------------------");
        }
    }

    public Pessoa buscarPessoaPorCPF(String cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return aluno;
            }
        }
        for (Professor professor : professores) {
            if (professor.getCpf().equals(cpf)) {
                return professor;
            }
        }
        return null;
    }
}