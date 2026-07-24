package Exercicio_05;
/*
Crie uma classe Funcionario com atributos protegidos nome , salarioBase e métodos:
Construtor que inicializa os atributos
Método calcularSalario() que retorna o salário base
Crie duas classes filhas:
FuncionarioCLT : adiciona horasExtras e sobrescreve calcularSalario() (salário base +
horas extras * 20)
FuncionarioComissionado : adiciona vendas e percentualComissao , sobrescreve
calcularSalario() (salário base + vendas * percentual)
 */
public class Funcionario
{
    protected String nome;
    protected double salarioBase;

    public Funcionario (String nome, double salarioBase)
    {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome()
    {
        return nome;
    }

    public double getSalarioBase()
    {
        return salarioBase;
    }

    public double calcularSalario ()
    {
        return salarioBase;
    }
    public void exibirInformacoes ()
    {
        System.out.println("Nome do funcionario: " + getNome());
        System.out.println("Salario base do funcionario: R$" + getSalarioBase());
    }
}
