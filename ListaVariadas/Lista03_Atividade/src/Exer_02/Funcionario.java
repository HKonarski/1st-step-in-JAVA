package Exer_02;

public class Funcionario
{
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario (String nome, String cpf, double salario)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public double getSalario()
    {
        return salario;
    }
    public void trabalhar ()
    {
        System.out.println(" Está trabalhando");
    }
    public void exibirInformcoesBasicas ()
    {
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("CPF do funcionario: " + cpf);
        System.out.println("Salario do funcionario: R$" + salario);
    }

}
