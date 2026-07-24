import java.util.Random;

public class Valor_randomico
{
    public static void main(String[] args)
    {
       for (int i =1; i<=10; i++)
       {
           Random dadosRandom = new Random();
           int teste = dadosRandom.nextInt(1, 10);
           System.out.printf(teste + " ");
       }
    }
}
