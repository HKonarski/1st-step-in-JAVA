import java.util.ArrayList;
import java.util.Scanner;
/*
12_Crie um ArrayList de números informados pelo usuário com Scanner e
remova todos os valores menores que 5.
 */
public class Exer_12
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        ArrayList<Integer> listaSem5 = new ArrayList<>();
        int recebeNum;
        System.out.println("informe o valor de deseja guardar na lista (digite ZERO para sair):");
        recebeNum = dados.nextInt();
        while (recebeNum !=0)
        {
            listaSem5.add(recebeNum);
            recebeNum = dados.nextInt();
        }
        listaSem5.removeIf(num -> num < 5);

        listaSem5.forEach(System.out::println);
    }
}