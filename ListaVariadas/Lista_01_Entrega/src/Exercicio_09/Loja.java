package Exercicio_09;

import java.util.ArrayList;
import java.util.List;

public class Loja
{
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Pedido> pedidos;

    public Loja()
    {
        produtos = new ArrayList<>();
        clientes = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto)
    {
        produtos.add(produto);
    }

    public void cadastrarCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public void registrarPedido(Pedido pedido)
    {
        pedidos.add(pedido);
        pedido.getCliente().adicionarPedido(pedido);
    }

    public void listarProdutos() {
        System.out.println("=== Produtos disponíveis ===");
        // for didático com índice
        for (int i = 0; i < produtos.size(); i++)
        {
            Produto p = produtos.get(i); // pega o produto na posição i
            System.out.println("Produto " + (i + 1) + ":");
            p.exibirInformacoes();
        }
    }

    public void listarClientes() {
        System.out.println("=== Clientes cadastrados ===");
        for (int i = 0; i < clientes.size(); i++)
        {
            Cliente c = clientes.get(i);
            System.out.println("Cliente " + (i + 1) + ":");
            c.exibirInformacoes();
        }
    }

    public void relatorioPedidos() {
        System.out.println("=== Relatório de Pedidos ===");
        for (int i = 0; i < pedidos.size(); i++)
        {
            Pedido p = pedidos.get(i);
            System.out.println("Pedido " + (i + 1) + ":");
            p.exibirResumo();
            System.out.println("-----------------------------");
        }
    }
}