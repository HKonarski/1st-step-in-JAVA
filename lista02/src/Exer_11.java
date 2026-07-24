import java.util.ArrayList;
import java.util.Scanner;
/*
11_Use ArrayList para guardar idades informadas pelo usuário com Scanner e
calcule a média
 */
public class Exer_11
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        ArrayList<Integer> listaIdade = new ArrayList<>();
        int recebeIdade;
        int somaIdade = 0;
        System.out.println("Informe a idade (ZERO para sair):");
        recebeIdade = dados.nextInt();
        while (recebeIdade !=0)
        {
            listaIdade.add(recebeIdade);
            recebeIdade = dados.nextInt();
        }
        for (int i = 0; i <listaIdade.size(); i++)
        {
            somaIdade += listaIdade.get(i);
        }
        System.out.printf("A media das notas é: "+somaIdade/listaIdade.size());
    }
}