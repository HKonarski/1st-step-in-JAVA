package Exercicio_08;

public class Triangulo extends Forma
{
    private double base;
    private double altura;

    public Triangulo (String cor, double base, double altura)
    {
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    public double getBase()
    {
        return base;
    }
    public double getAltura()
    {
        return altura;
    }
    @Override
    public double calcularArea()
    {
        return (base * altura)/2;
    }
    // isso para um triangulo equilatero o resto não tem como
    @Override
    public double calcularPerimetro()
    {
        return base * 3;
    }
    @Override
    public void exibirInformacoes()
    {
        super.exibirInformacoes();
        System.out.println("A base do triangulo é: " + getBase());
        System.out.println("A altura do triangulo é: " + getAltura());
        System.out.println("A area do triangulo é: " + calcularArea());
        System.out.println("O perimetro do triangulo equilatero é: " + calcularPerimetro());
    }
}
