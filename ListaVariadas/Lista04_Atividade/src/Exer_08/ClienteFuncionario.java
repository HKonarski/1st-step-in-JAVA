package Exer_08;

public class ClienteFuncionario extends Cliente
{
    public ClienteFuncionario (String name)
    {
        super(name);
    }
    @Override
    public double calcularDesconto(double valorCompra)
    {
        return valorCompra - (valorCompra * 0.30);
    }
}
