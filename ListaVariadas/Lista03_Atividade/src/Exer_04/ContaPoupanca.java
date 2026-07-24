package Exer_04;

public class ContaPoupanca extends Conta
{
    public ContaPoupanca (String numero, String titular, double saldo)
    {
        super(numero, titular, saldo);
    }
    public void depositarCp (double valor)
    {
        saldo += valor;
        System.out.println("Valor depositado R$" +valor + " com sucesso.");
    }
    public void sacarCp (double valor)
    {
        if (valor <= saldo)
        {
            saldo -= valor;
            System.out.println("Valor sacado R$" + valor + " com sucesso");
        }
        else
        {
            System.out.println("Valor de saque não permitido.");
        }
    }
    public void renderJuros (double taxa)
    {
        saldo += saldo * taxa;
        System.out.println("Juros aplicados. novo saldo: R$" + saldo);
    }

}
