package Exer_01;

public class Produto
{
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto (String nome, double preco, int quantidadeEmEstoque)
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome()
    {
        return nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque)
    {
        if (quantidadeEmEstoque>=1)
        {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
        else
        {
            System.out.println("informado não permitido!!");
        }

    }

    public void exibirInformacoes()
    {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque+ " Unids.");
    }
    public void adicinaEstoque (int quantidade)
    {
        quantidadeEmEstoque += quantidade;
        System.out.println("Adicionando: "+quantidade+ " no estoque");
    }
    public void removeEstoque(int quantidade)
    {
        if (quantidade <= quantidadeEmEstoque)
        {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Removido: " +quantidade+ " no estoque");
        }
        else
        {
            System.out.println("estoque insuficiente para remover essa quantidade!!");
        }
    }

}
