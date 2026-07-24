package Exer_01;

public class ContaCorrente extends ContaBancaria
{

    public ContaCorrente(String numero, String titular, double saldoInicial)
    {
        super(numero, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= -1000) { // pode ficar negativo até -1000
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Limite de cheque especial excedido!");
        }
    }
}
