package Exercicio_08;

public class Circulo extends Forma
{
    private double raio;
    public Circulo (String cor, double raio)
    {
        super(cor);
        this.raio = raio;
    }

    public double getRaio()
    {
        return raio;
    }
    @Override
    public double calcularArea ()
    {
        return Math.PI  * (raio * raio);
    }
    @Override
    public double calcularPerimetro ()
    {
        return Math.PI * (2* raio);
    }
    @Override
    public void exibirInformacoes ()
    {
        super.exibirInformacoes();
        System.out.println("O raio do circulo é: " + getRaio());
        System.out.println("A area do circulo é: " + calcularArea());
        System.out.println("O perimetro do circulo é: " + calcularPerimetro());
    }
}
