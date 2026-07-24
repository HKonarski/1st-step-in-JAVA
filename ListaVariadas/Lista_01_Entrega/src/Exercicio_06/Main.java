package Exercicio_06;

public class Main
{
    public static void main (String [] args)
    {
        Cachorro cachorro = new Cachorro("Cachorro", 5, "curto", "labrador");
        Gato gato = new Gato("Gato", 6,"longo","Azul");

        cachorro.exibirInformacoes();
        cachorro.amamentar();
        cachorro.dormir();
        cachorro.latir();
        System.out.println("-------------------------*******-------------------------");
        gato.exibirInformacoes();
        gato.amamentar();
        gato.dormir();
        gato.miar();
    }
}
