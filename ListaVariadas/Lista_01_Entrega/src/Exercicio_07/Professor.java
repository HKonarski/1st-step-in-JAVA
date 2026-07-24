package Exercicio_07;

public class Professor extends Pessoa
{
    private double salario;
    private String disciplina;

    public Professor (String nome, int idade, String cpf, double salario, String disciplina)
    {
        super(nome, idade, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario()
    {
        return salario;
    }

    public String getDisciplina()
    {
        return disciplina;
    }

    public void alteraValor (double percentual)
    {
            salario += salario * (percentual/100);
    }
    @Override
    public void exibirInformacoes ()
    {
        super.exibirInformacoes();
        System.out.println("Disciplina ministrada: " + getDisciplina());
        System.out.println("Salário: R$ "+ getSalario());
    }
}
