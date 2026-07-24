package Exercicio_09;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa
{
    private String endereco;
    private List<Pedido> pedidos;

    public Cliente(String nome, String cpf, String endereco)
    {
        super(nome, cpf);
        this.endereco = endereco;
        this.pedidos = new ArrayList<>();
    }

    public String getEndereco()
    {
        return endereco;
    }

    public List<Pedido> getPedidos()
    {
        return pedidos;
    }

    public void adicionarPedido(Pedido pedido)
    {
        pedidos.add(pedido);
    }

    @Override
    public void exibirInformacoes()
    {
        super.exibirInformacoes();
        System.out.println("Endereço: " + endereco);
    }
}