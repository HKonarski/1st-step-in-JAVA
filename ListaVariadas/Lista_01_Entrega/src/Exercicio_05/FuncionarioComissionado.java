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
public class FuncionarioComissionado extends Funcionario
{
    private int numeroVendas;
    public FuncionarioComissionado (String nome, double salario, int numeroVendas)
    {
        super(nome, salario);
        this.numeroVendas = numeroVendas;
    }
    @Override
    public double calcularSalario ()
    {
        return salarioBase + (numeroVendas * 10);
    }
    @Override
    public void exibirInformacoes ()
    {
        super.exibirInformacoes();
        System.out.println("Numero de vendas foi: " + numeroVendas);
        System.out.println("Salario base mais comissão: R$" + calcularSalario());
    }

}
