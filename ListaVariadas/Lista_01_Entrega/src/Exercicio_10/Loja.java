package Exercicio_10;

import java.util.ArrayList;
import java.util.List;

public class Loja
{
    private List<Veiculo> veiculos;
    private List<Cliente> clientes;
    private List<Locacao> locacoes;

    public Loja()
    {
        veiculos = new ArrayList<>();
        clientes = new ArrayList<>();
        locacoes = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v)
    {
        veiculos.add(v);
    }
    public void adicionarCliente(Cliente c)
    {
        clientes.add(c);
    }

    public Locacao realizarLocacao(Cliente c, Veiculo v, int dias)
    {
        if (!v.isDisponivel())
        {
            System.out.println("Veículo indisponível!");
            return null;
        }
        Locacao l = new Locacao(c, v, dias);
        locacoes.add(l);
        return l;
    }

    public List<Veiculo> getVeiculos()
    {
        return veiculos;
    }
    public List<Cliente> getClientes()
    {
        return clientes;
    }
    public List<Locacao> getLocacoes()
    {
        return locacoes;
    }

    public void listarVeiculos()
    {
        System.out.println("=== Veículos ===");
        // FOR DIDÁTICO
        for (int i = 0; i < veiculos.size(); i++)
        {
            Veiculo v = veiculos.get(i);
            System.out.println("[" + (i + 1) + "]");
            v.exibirInfo();
        }
    }
    public void listarClientes() {
        System.out.println("=== Clientes ===");
        for (int i = 0; i < clientes.size(); i++)
        {
            Cliente c = clientes.get(i);
            System.out.println("[" + (i + 1) + "]");
            c.exibirInfo();
        }
    }

    public void listarLocacoes()
    {
        System.out.println("=== Locações ===");
        for (int i = 0; i < locacoes.size(); i++)
        {
            Locacao l = locacoes.get(i);
            System.out.println("[" + (i + 1) + "]");
            l.exibirResumo();
        }
    }
}