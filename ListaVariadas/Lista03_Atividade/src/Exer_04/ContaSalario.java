package Exer_04;

public class ContaSalario extends Conta
{
    public ContaSalario (String numero, String titular, double salario)
    {
        super(numero, titular, salario);
    }
    public void depositarCs (double valor)
    {
        saldo += valor;
        System.out.println("Valor depositado de R$" + valor + " com sucesso.");
    }
    public void sacarCs (double valor)
    {
        if (valor <= saldo)
        {
            saldo -= valor;
            System.out.println("Valor sacado de R$" + valor + " com sucesso.");
        }
        else
        {
            System.out.println("Valor de saque não permitido.");
        }
    }
}
