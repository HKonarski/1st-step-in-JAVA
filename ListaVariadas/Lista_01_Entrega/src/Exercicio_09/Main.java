package Exercicio_09;

public class Main {
    public static void main(String[] args)
    {
        Loja loja = new Loja();

        Produto p1 = new Produto(1, "Notebook", 3500.0, 10);
        Produto p2 = new Produto(2, "Smartphone", 2000.0, 5);

        loja.cadastrarProduto(p1);
        loja.cadastrarProduto(p2);

        Cliente c1 = new Cliente("Carlos", "123456789", "Rua A, 123");
        loja.cadastrarCliente(c1);

        Pedido pedido1 = new Pedido(c1);
        pedido1.adicionarItem(p1, 2);
        pedido1.adicionarItem(p2, 1);

        loja.registrarPedido(pedido1);

        loja.listarProdutos();
        loja.listarClientes();
        loja.relatorioPedidos();
    }
}
