import java.util.ArrayList;
import java.util.Scanner;

/*
5_Use ArrayList para guardar números até digitar 0, depois mostre quantos
foram digitados
 */
public class Exer_05
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        ArrayList<Integer> recebeNumeros = new ArrayList<>();
        int numRecebe;
        System.out.println("Informe um numero (digite zero para sair)");
        numRecebe = dados.nextInt();
        while (numRecebe !=0)
        {
            recebeNumeros.add(numRecebe);
            numRecebe = dados.nextInt();
        }
        for (int i = 0; i <recebeNumeros.size(); i++)
        {
            System.out.println(recebeNumeros.get(i));
        }
    }
}
