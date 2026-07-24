package Exer_01;

public class OperadorMatematico
{
    // Soma de dois inteiros
    public int calcular(int a, int b)
    {

        return a + b;
    }
    public int calcular(int a, int b, int c)
    {

        return a + b + c;
    }
    public double calcular(double a, double b)
    {

        return a + b;
    }
    public double calcular(double a, double b, String operacao)
    {
        switch (operacao)
        {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) return a / b;
                else throw new ArithmeticException("Divisão por zero não permitida.");
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }
    public int calcular(int a, int b, String operacao)
    {
        switch (operacao) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) return a / b;
                else throw new ArithmeticException("Divisão por zero não permitida.");
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }
}
