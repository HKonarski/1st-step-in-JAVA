package Exer_01;

public class ContaPoupanca extends ContaBancaria
{
    public ContaPoupanca (String numero, String titular, double saldoInicial)
    {
        super (numero, titular, saldoInicial);
    }

    @Override
    public void sacar (double valor)
    {
        if (saldo - valor >= 0)
        {
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + "realizado. Novo saldo é: R$" +saldo);
        }
        else
        {
            System.out.println("Saldo insuficiente para saque!");
        }
    }
}
