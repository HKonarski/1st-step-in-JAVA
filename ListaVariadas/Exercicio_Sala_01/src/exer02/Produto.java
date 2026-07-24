package exer02;

public class Produto
{
    private String descricao;
    private int quantidadeEstoque;
    private double valorUnitario;
    private String categoria;

public void cadastrar (String descricao, double valorUnitario)
    {
    this.descricao = descricao;
    this.valorUnitario = valorUnitario;
    this.quantidadeEstoque = 1;
    }
    public void cadastrar (String descricao, int quantidadeEstoque, double valorUnitario)
    {
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
    }
    public void cadastrar (String descricao, int quantidadeEstoque, double valorUnitario, String categoria)
    {
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }
}