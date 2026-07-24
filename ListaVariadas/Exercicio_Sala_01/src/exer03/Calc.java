package exer03;

public class Calc
{
    private int num1;
    private int num2;
    private int num3;


    public int Calcular (int num1, int num2)
    {
        int valorFinal = num1 = num2;
        return valorFinal;
    }
    public int calcular (int num1, int num2, int num3)
    {
        int valorFinal = num1+num2+num3;
        return valorFinal;
    }
    public double calcular (double num1, double num2)
    {
        double valorFinal = num1 * num2;
        return valorFinal;
    }
    public int calcular (int num3)
    {
        return num3*num3;
    }
}
