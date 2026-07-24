package Exer_08;

public class ClienteVip extends Cliente
{
    public ClienteVip (String name)
    {
        super(name);
    }

    @Override
    public double calcularDesconto(double valorCompra)
    {
        return valorCompra - (valorCompra * 0.15);
    }
}
