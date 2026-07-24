package Exer_08;

public class Cliente
{
    private String name;

    public Cliente (String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public double calcularDesconto(double valorCompra)
    {
        return valorCompra;
    }
    public void exibirInfo()
    {
        System.out.println("Nome do cliente: " + getName());
    }
}
