import java.util.ArrayList;
import java.util.Scanner;
/*
14_Armazene palavras em ArrayList informadas pelo usuário com Scanner  e
conte quantas começam com vogal.
 */
public class Exer_14
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        ArrayList<String> listaPalavras = new ArrayList<>();
        String recebePalavra;
        int cont = 0;

        System.out.println("Informe a palavra para guardar na lista (digite SAIR para finalizar):");

        recebePalavra = dados.nextLine().toLowerCase();
        while (!recebePalavra.equals("sair"))
        {
            listaPalavras.add(recebePalavra);
            recebePalavra = dados.nextLine().toLowerCase();
        }
        for (int i = 0; i < listaPalavras.size(); i++)
        {
            if (!listaPalavras.get(i).isEmpty() && "aeiou".indexOf(listaPalavras.get(i).charAt(0)) != -1)
            {
                cont++;
            }
        }
        System.out.println("------------------------------");
        listaPalavras.forEach(System.out::println);
        System.out.println("Quantidade de palavras que iniciam com vogais: " + cont);
    }
}