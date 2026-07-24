import java.util.ArrayList;
import java.util.Scanner;

/*
8_Crie um ArrayList de nomes e:
a) Adicione 3 nomes
b) Insira um nome na segunda posição usando add(index, element)
c) Substitua o último nome usando set()
d) Remova um nome específico usando remove()
e) Verifique se um nome existe usando contains()
f) Mostre a lista usando forEach(
 */
public class Exer_08
{
    public static void main(String[] args)
    {
        ArrayList<String> nomeArray = new ArrayList<>();
        Scanner dados = new Scanner(System.in);
        int cont=0;
        String nomeAdd;
        String procuraNome;
        System.out.println("Informe tres nomes:");

        while (cont<3)
        {
            nomeAdd = dados.nextLine().toLowerCase();
            nomeArray.add(nomeAdd);
            cont++;
        }
        for (int i = 0; i< nomeArray.size(); i++)
        {
            System.out.println("nome o nome digitado foi: "+nomeArray.get(i));
        }
        nomeArray.add(1, "karol com k");
        System.out.println("O nome "+ nomeArray.get(1)+" foi adicionado na segunda posição ");
        nomeArray.set(3, "Kelli com I");
        System.out.println("O nome "+nomeArray.get(3)+" modificado na ultima posição");
        System.out.println("Informe o nome defesa localizar:");
        procuraNome = dados.nextLine().toLowerCase();
        if (nomeArray.contains(procuraNome))
        {
            System.out.println("Esse nome está na lista");
        }else
        {
            System.out.println("Esse nome NÃO está na lista");
        }
        System.out.println("-----------------------------");
        nomeArray.forEach(System.out::println);
    }
}
