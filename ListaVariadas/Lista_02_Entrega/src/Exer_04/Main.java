package Exer_04;
public class Main
{
    public static void main(String[] args)
    {
        ClienteBase clientePadrao = new ClienteBase();
        ClienteBase clienteGold = new ClienteGold();
        ClienteBase clientePlatinum = new ClientePlatinum();

        double valorCompra = 100.0;

        System.out.println("Desconto Cliente Padrão: R$ " + clientePadrao.aplicarRegraDesconto(valorCompra));
        System.out.println("Desconto Cliente Gold: R$ " + clienteGold.aplicarRegraDesconto(valorCompra));
        System.out.println("Desconto Cliente Platinum: R$ " + clientePlatinum.aplicarRegraDesconto(valorCompra));
    }
}

