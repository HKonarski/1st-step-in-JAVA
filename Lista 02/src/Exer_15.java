import java.util.ArrayList;
import java.util.Scanner;

/*
15_Use ArrayList para guardar notas 0 a 10 informados pelo usuário com
Scanner e mostre quantas estão acima de 7
 */
public class Exer_15
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        ArrayList<Double> listaNotas = new ArrayList<>();
        double recebeNotas;
        System.out.println("Informe as notas que deseja armazenar (Digita um numero negatigo para sair)");
        recebeNotas = dados.nextDouble();
        while (recebeNotas>=0)
        {
            if(recebeNotas<=10 && recebeNotas>=0) // entra no array somente se o valor estiver entre 0 a 10
            {
                listaNotas.add(recebeNotas); // armazena notas do array listaNotas
            }
            recebeNotas = dados.nextDouble();
        }
        for (int i = 0; i < listaNotas.size(); i++)
        {
            if(listaNotas.get(i)>=7)
            {
                System.out.println("Nota acima de sete: "+listaNotas.get(i));
            }
            /*else
            {
                System.out.println("Abaixo de sete "+listaNotas.get(i));
            }*/
        }
        //System.out.println("------------------Lista notas gerais------------------");
        //listaNotas.forEach(System.out::println);
    }
}