package Exer_08;

import java.util.ArrayList;

public class Main
{
    public static void main (String [] arg)
    {
        double valorCompra = 150;
        double valorFinal;
        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new ClienteComum("Lucas"));
        clientes.add(new ClienteVip("João"));
        clientes.add(new ClienteFuncionario("Ricardo"));

        System.out.println("=== Teste de Descontos ===");
        for (int i = 0; i < clientes.size(); i++)
        {
            Cliente c = clientes.get(i);
            valorFinal = c.calcularDesconto(valorCompra);
            System.out.println("Cliente: " + c.getName() +
                               "| Valor original: R$" + valorCompra +
                               "| valor com desconto: R$" + valorFinal);
        }
    }
}
