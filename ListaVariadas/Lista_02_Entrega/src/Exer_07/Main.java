package Exer_07;

public class Main
{
    public static void main(String[] args)
    {
        Componente cache = new ServicoCache("1.2.0");
        Componente api = new ServicoAPI("2.0.1");

        cache.statusAtual();
        cache.iniciarComponente();
        cache.desligarComponente();

        System.out.println();

        api.statusAtual();
        api.iniciarComponente();
        api.desligarComponente();
    }
}
