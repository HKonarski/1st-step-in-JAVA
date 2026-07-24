import java.util.ArrayList;
import java.util.Scanner;
/*
13_Crie um ArrayList de números informados pelo usuário com Scanner e
mostre o dobro de cada valor
 */
public class Exer_13
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        ArrayList<Integer> listDobro = new ArrayList<>();
        int numRecebe;
        int numDobra;
        System.out.println("Informe o valor de deseja guardar na lista (digite ZERO para sair):");
        numRecebe = dados.nextInt();
        while (numRecebe !=0)
        {
            numDobra = numRecebe *2;
            listDobro.add(numDobra);
            numRecebe = dados.nextInt();

        }
        listDobro.forEach(System.out::println);
    }
}
