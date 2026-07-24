package Exercicio_02;
/*
Exercício 2 - Encapsulamento com Validação
*--Crie uma classe ContaBancaria com os atributos privados numero , titular e saldo .
Implemente:
*--Métodos getters para todos os atributos
*--Método setter para titular (apenas)
*--Método depositar(valor) que adiciona valor ao saldo (validar se valor > 0)
*--Método sacar(valor) que remove valor do saldo (validar se há saldo suficiente)
*--Método consultarSaldo() que retorna o saldo atual
 */
public class ContaBancaria
{
    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    public ContaBancaria (int numeroConta, String nomeTitular, double saldoConta)
    {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }

    public String getNomeTitular()
    {
        return nomeTitular;
    }

    public double getSaldoConta()
    {
        return saldoConta;
    }

    public void setNomeTitular(String nomeTitular)
    {
        this.nomeTitular = nomeTitular;
    }
    public void depositar (double valor)
    {
        if (valor>0)
        {
            saldoConta += valor;
            System.out.println("Valor depositado é: "+valor+"\nSeu novo saldo é: "+saldoConta);
        }
        else
        {
            System.out.println("Valor invalido para esse deposito");
        }
    }
    public void sacar (double valor)
    {
        if (valor <= saldoConta && valor>0)
        {
            saldoConta -= valor;
            System.out.println("Valor sacado é: R$ "+valor);
        }
        else
        {
            System.out.println("Valor invalido para Saque");
        }
    }
    public String consultarSaldo ()
    {
        return "Seu saldo é: R$" +saldoConta;
    }
    public String mostrar()
    {
        return"numero da conta: "+numeroConta + "\nNome do Titular: "+nomeTitular + "\nSaldo é: R$"+saldoConta;
    }
}
