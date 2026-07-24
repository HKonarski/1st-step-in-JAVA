import java.util.ArrayList;
import java.util.Scanner;

/*
10_Crie dois ArrayLists de números informados pelo usuário com Scanner e
junte-os num terceiro
 */
public class Exer_10
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        int valorLe1;
        int valorLe2;
        System.out.println("Informe os valores inteiros para uma lista 1 (ZERO para finalizar)");
        valorLe1 = dados.nextInt();
        while (valorLe1 !=0)
        {
            lista1.add(valorLe1);
            valorLe1 = dados.nextInt();
        }
        System.out.println("Informe os valores inteiros para uma lista 2 (ZERO para finalizar)");
        valorLe2 = dados.nextInt();
        while (valorLe2 != 0)
        {
            lista2.add(valorLe2);
            valorLe2 = dados.nextInt();
        }
        for (int i = 0; i<lista1.size(); i++)
        {
            lista3.add(i, lista1.get(i));
        }
        for (int i = 0; i< lista2.size(); i++)
        {
            lista3.add(i, lista2.get(i));
        }
        lista3.forEach(System.out::println);
    }
}