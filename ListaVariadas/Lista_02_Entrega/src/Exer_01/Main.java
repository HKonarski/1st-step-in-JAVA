package Exer_01;
public class Main
{
    public static void main(String[] args)
    {
        OperadorMatematico op = new OperadorMatematico();
        System.out.println(op.calcular(5, 3));
        System.out.println(op.calcular(10, 2, "-"));
        System.out.println(op.calcular(4.5, 2.0, "*"));
        System.out.println(op.calcular(1, 2, 3));
    }
}
