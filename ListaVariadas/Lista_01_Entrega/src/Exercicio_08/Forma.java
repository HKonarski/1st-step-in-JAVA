package Exercicio_08;

public class Forma
{
    protected String cor;

    public Forma(String cor)
    {
        this.cor = cor;
    }

    public String getCor()
    {
        return cor;
    }
    public double calcularArea()
    {
        return 0.0;
    }
    public double calcularPerimetro()
    {
        return 0.0;
    }
    public void exibirInformacoes()
    {
        System.out.println("A cor é: " + getCor());
    }

}
