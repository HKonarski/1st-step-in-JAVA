package Exer_01;

public abstract class ContaBancaria
{
    private String numero;
    private String titular;
    protected double saldo;

    public ContaBancaria (String nome, String titular, double saldo)
    {
        this.numero = nome;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNome()
    {
        return numero;
    }

    public String getTitular()
    {
        return titular;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void depositar (double valor)
    {
        if (valor > 0)
        {
            saldo += valor;
            System.out.println("Deposito de: R$" + valor + " realozado. Saldo atual: R$" + getSaldo());
        }
        else
        {
            System.out.println("Valor informato incorreto.");
        }
    }
    public double consultarSaldo()
    {
        return saldo;
    }
    public void exibirInfo ()
    {
        System.out.println("Nome do cliente: " + getTitular());
        System.out.println("Numero da conta: " + getTitular());
    }
    public abstract void sacar (double valor);
}
