package Exer_04;
public class ClientePlatinum extends ClienteBase {
    @Override
    public double aplicarRegraDesconto(double valorCompra)
    {
        return valorCompra - (valorCompra * 0.25);
    }
}