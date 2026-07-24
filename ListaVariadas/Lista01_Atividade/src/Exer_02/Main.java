package Exer_02;

public class Main
{
    public static void main (String [] args)
    {
        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Uno";
        c1.ano = 1996;
        c1.combustivel = 46;

        System.out.println("---------------****---------------");
        System.out.println("Marca do Veiculo: " + c1.marca);
        System.out.println("Modelo do Veiculo: " + c1.modelo);
        System.out.println("Ano do Veiculo: " + c1.ano);
        System.out.println("Nivel do Combustivel: " + c1.combustivel);

        System.out.println("---------------****---------------");
        for (int i = 0; i<5; i++)
        {
            System.out.println("Nivel do Combustivel: " + c1.combustivel);
            c1.acelerar(10);
            System.out.println("---------------****---------------");
        }
    }
}
