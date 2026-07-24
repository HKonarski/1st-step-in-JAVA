import java.util.ArrayList;
import java.util.Scanner;

/*
6_Crie um ArrayList de Strings e remova todas as palavras com menos de 4
letras
 */
public class Exer_06
{
    public static void main(String[] args)
    {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner dados = new Scanner(System.in);
        String recNomes;
        int cont = 0;
        System.out.println("Informe um nome:");
        while (cont<5)
        {
            recNomes = dados.nextLine().toLowerCase();
            nomes.add(recNomes);
            cont++;
        }
        for (int i = nomes.size()-1; i >= 0; i--)
        {
            if (nomes.get(i).length()>=5)
            {
                nomes.remove(i);
            }
        }
        for (int i = 0; i< nomes.size(); i++)
        {
            System.out.println(nomes.get(i));
        }
    }
}
