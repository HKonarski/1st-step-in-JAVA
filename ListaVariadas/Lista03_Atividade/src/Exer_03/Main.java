package Exer_03;

public class Main
{
    public static void main (String [] args)
    {
        Leao felino = new Leao("Leões", "Felino", 5);
        Macaco macaco = new Macaco("Mico Leão Dourado", "Macaco", 6);
        Passaro passaro = new Passaro("Tucano", "Passaro", 2);
        System.out.println("=========== Leões ===========");
        felino.exibirinformacoes();
        felino.comer();
        felino.dormir();
        felino.atividades();

        System.out.println("=========== Macacos ===========");
        macaco.exibirinformacoes();
        macaco.comer();
        macaco.dormir();
        macaco.atividades();

        System.out.println("=========== Leões ===========");
        passaro.exibirinformacoes();
        passaro.comer();
        passaro.dormir();
        passaro.atividades();
    }
}
