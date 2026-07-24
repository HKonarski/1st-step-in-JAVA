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
public class Main
{
    public static void main (String [] args)
    {
        FuncionarioCLT fun1 = new FuncionarioCLT("João da Silva", 1800.00, 30);
        FuncionarioComissionado fun2 = new FuncionarioComissionado("Carla Ribeiro", 1800.00, 30);

        fun1.exibirInformacoes();
        System.out.println("-------------********-------------\n");
        fun2.exibirInformacoes();
        System.out.println("-------------********-------------");
    }
}
