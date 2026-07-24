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
public class FuncionarioCLT extends Funcionario
{
    private int horaExtra;
    public FuncionarioCLT (String nome, double salarioBase, int horaExtra)
    {
        super(nome, salarioBase);
        this.horaExtra = horaExtra;
    }

    public int getHoraExtra()
    {
        return horaExtra;
    }

    @Override
    public double calcularSalario ()
    {
        return salarioBase + (horaExtra * 20);
    }
    @Override
    public void exibirInformacoes ()
    {
        super.exibirInformacoes();
        System.out.println("horas extras realizadas: " + getHoraExtra());
        System.out.println("Salario com extra: R$" + calcularSalario());
    }
}
