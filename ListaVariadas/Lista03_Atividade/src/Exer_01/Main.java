package Exer_01;

public class Main
{
    public static void main (String [] args)
    {
        Carro c1 = new Carro("Toyota", "Hylux", 2010, 5);
        Moto m1 = new Moto("Honda", "CG-125", 2020, true);
        Barco b1 = new Barco("Yamaha", "Xboat", 2018, 2);

        System.out.println("-------------------***********-------------------\n");
        c1.exibirInformacoes();
        c1.ligarArCondicionado();
        c1.acelerar();
        c1.frear();
        c1.abrirPortas();
        System.out.println("-------------------***********-------------------\n");
        m1.exibirInformacoes();
        m1.exibirInformacoesMoto();
        m1.buzinar();
        m1.acelerar();
        m1.empinar();
        m1.frear();
        System.out.println("-------------------***********-------------------\n");
        b1.exibirInformacoes();
        b1.nagevar();
        b1.ancorar();
    }
}
