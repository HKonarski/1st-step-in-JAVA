package Exercicio_09;

public class Produto
{
    private int codigo;
    private String nomeProduto;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nomeProduto, double preco, int estoque)
    {
        this.codigo = codigo;
        this.nomeProduto= nomeProduto;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String getNomeProduto()
    {
        return nomeProduto;
    }

    public double getPreco()
    {
        return preco;
    }

    public int getEstoque()
    {
        return estoque;
    }

    public boolean reduzirEstoque(int quantidade)
    {
        if (quantidade <= estoque)
        {
            estoque -= quantidade;
            return true;
        }
        return false;
    }

    public void aumentarEstoque(int quantidade)
    {
        estoque += quantidade;
    }

    public void exibirInformacoes()
    {
        System.out.printf("Código: " + getCodigo());
        System.out.printf(" | Produto: " + getNomeProduto());
        System.out.printf(" | Preço: R$" + getPreco());
        System.out.println(" | Estoque: " + getEstoque());

    }
}
