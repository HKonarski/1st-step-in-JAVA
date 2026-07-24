package Exercicio_07;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa
{
    private int numeroMatricula;
    private String cursoMatriculado;
    private List<Double> notas;

    public Aluno (String nome, int idade, String cpf, int numeroMatricula, String cursoMatriculado)
    {
        super(nome, idade, cpf);
        this.numeroMatricula = numeroMatricula;
        this.cursoMatriculado = cursoMatriculado;
        this.notas = new ArrayList<>();
    }

    public int getNumeroMatricula()
    {
        return numeroMatricula;
    }

    public String getCursoMatriculado()
    {
        return cursoMatriculado;
    }

    public List<Double> getNotas()
    {
        return notas;
    }

    public void adicionarNota (double nota)
    {
        notas.add(nota);
    }

    public double mediaGeral ()
    {
        double soma = 0;
        double media;
        int quantidadeNotas = notas.size();
        if(quantidadeNotas == 0)
        {
            return 0.0;
        }
        for (int i =0; i< quantidadeNotas; i++)
        {
            soma += notas.get(i);
        }
        return media = soma / quantidadeNotas;
    }
    @Override
    public void exibirInformacoes ()
    {
        super.exibirInformacoes();
        System.out.println("Matricula: " + getNumeroMatricula());
        System.out.println("Curso Matriculado: "+ getCursoMatriculado());
        System.out.println("Notas: " + getNotas());
        System.out.println("Media geral: "+ mediaGeral());
    }
}
