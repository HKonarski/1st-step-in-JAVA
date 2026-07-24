package Exer_02;

public class Main
{
    public static void main (String [] args)
    {
        Carro c1 = new Carro("Fiat", "Uno", 1996, 30);
        Carro c2 = new Carro("Chevrolet", "Chevette", 1988, 25);

        c1.exibirInformações ();
        c2.exibirInformações ();
        System.out.println("-------------------***********-------------------");
        c1.abastecer(15);
        c1.acelerar(5);
        System.out.println("-------------------***********-------------------");
        c2.abastecer(10);
        c2.acelerar(10);
        System.out.println("-------------------***********-------------------");
        c1.exibirInformações();
        c2.exibirInformações();
    }


}
