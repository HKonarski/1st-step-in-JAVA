package Exer_04;

public class Conta
{
    private String numero;
    private String titular;
    protected double saldo;

    public Conta (String numero, String titular, double saldo)
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero()
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

    public void setNumero(String numero)
    {
        if (numero.length() == 6)
        {
            this.numero = numero;
        }
    }

    public void  exibirInformacoes ()
    {
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Titular da conta: " + getTitular());
        System.out.println("Saldo da conta: R$" + getSaldo());
    }
}
