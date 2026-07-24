package Exer_06;

public class Main
{
    public static void main (String [] args)
    {
        Termometro t1 = new Termometro(25, "c");

        System.out.println("temperatura inicial: " + t1.getTemperatura());

        t1.converteParaF();
        System.out.println("Conversão para Fahrenheit: " + t1.getTemperatura());

        t1.convertparaC();
        System.out.println("Conversão para Celsius: " + t1.getTemperatura());

        t1.setTemperaturaAtual(50);
        System.out.println("temperatura ajustada: " + t1.getTemperatura());
    }
}
