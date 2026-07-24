package Exer_07;

public class Conversor
{
    public int converter (int quilometros)
    {
        return quilometros * 1000;
    }
    public double converter (double celsius)
    {
        return celsius * 1.8 + 32;
    }
    public double converter(double reais, double dolar)
    {
        return reais / dolar;
    }
    public int converter (int horas, boolean tempo)
    {
        return horas * 60;
    }
}
