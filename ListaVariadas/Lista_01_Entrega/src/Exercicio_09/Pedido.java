package Exercicio_09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido
{
    private Cliente cliente;
    private LocalDate dataPedido;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente)
    {
        this.cliente = cliente;
        this.dataPedido = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void adicionarItem(Produto produto, int quantidade)
    {
        if (produto.reduzirEstoque(quantidade))
        {
            itens.add(new ItemPedido(produto, quantidade));
        } else {
            System.out.println("Estoque insuficiente para o produto: " + produto.getNomeProduto());
        }
    }

    public double calcularTotal()
    {
        double total = 0;
        for (ItemPedido item : itens)
        {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void exibirResumo()
    {
        System.out.println("Pedido do cliente: " + cliente.getNome());
        System.out.println("Data: " + dataPedido);
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto().getNomeProduto() + " - Quantidade: " + item.getQuantidade() + " - Subtotal: R$" + item.calcularSubtotal());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
