package Exer_04;

public class ContaCorrente extends Conta
{
    public ContaCorrente (String numero, String titular, double saldo)
    {
        super(numero, titular, saldo);
    }
    public void sacarCc (double valor)
    {
        if (valor <= saldo)
        {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        }
        else
        {
            System.out.println("Valor de saque não permitido.");
        }
    }
    public void depositarCc (double valor)
    {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }
}
