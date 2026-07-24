package Exer_07;

public class Main
{
    public static void main (String [] args)
    {
        Conversor conversor = new Conversor();

        System.out.println("Km para M: " + conversor.converter(5) + "m");
        System.out.println("Celsius para fahrenhit: "  +conversor.converter(25.5) + "ºF");
        System.out.println("Real para dolar U$" + conversor.converter(100.0, 5.29));
        System.out.println("Horas é minutos: " + conversor.converter(24,true));
    }
}
