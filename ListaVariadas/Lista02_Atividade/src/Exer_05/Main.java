package Exer_05;

public class Main
{
    public static void main (String [] args)
    {
        Elavador elevador = new Elavador(15, 6);
        elevador.exibirInformacoes();
        elevador.etrar(2);
        elevador.subir();
        elevador.subir();
        elevador.exibirInformacoes();

        elevador.etrar(1);
        elevador.etrar(2);
        elevador.etrar(3);
        elevador.exibirInformacoes();

        for (int i= elevador.getAndarAtual(); i< 15; i++)
        {
            elevador.subir();
        }
        System.out.println("--------------*******--------------");
        for (int i = elevador.getAndarAtual(); i> 0; i--)
        {
            elevador.descer();
        }
        System.out.println("--------------*******--------------");
        elevador.sair(4);
        elevador.exibirInformacoes();
    }
}
