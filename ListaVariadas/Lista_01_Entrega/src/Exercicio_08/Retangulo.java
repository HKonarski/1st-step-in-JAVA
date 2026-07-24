package Exercicio_08;

public class Retangulo extends Forma
{
    private double largura;
    private double altura;
    public Retangulo (String cor, double largura, double altura)
    {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public double getLargura()
    {
        return largura;
    }

    public double getAltura()
    {
        return altura;
    }
    @Override
    public double calcularArea()
    {
        return altura * largura;
    }
    @Override
    public double calcularPerimetro()
    {
        return (2*altura) + (2*largura);
    }
    @Override
    public void exibirInformacoes()
    {
        super.exibirInformacoes();
        System.out.println("A largura do retangulo é: " + getLargura());
        System.out.println("A altura do retangulo é: " + getAltura());
        System.out.println("A Area do retangulo é: " + calcularArea());
        System.out.println("O perimetro do retangulo é: " + calcularPerimetro());
    }
}
