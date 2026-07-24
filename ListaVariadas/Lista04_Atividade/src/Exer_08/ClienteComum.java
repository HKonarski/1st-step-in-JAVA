package Exer_08;

public class ClienteComum extends Cliente
{
    public ClienteComum (String name)
    {
        super(name);
    }

    @Override
    public double calcularDesconto(double valorCompra)
    {
        return valorCompra - (valorCompra * 0.05);
    }

}
