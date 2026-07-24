import java.util.ArrayList;
import java.util.Scanner;

/*
7_Armazene números em ArrayList e mostre a soma dos valores pares
 */
public class Exer_07
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numLista = new ArrayList<>();
        Scanner dados =new Scanner(System.in);
        int soma=0;
        int recebeNum;
        int cont =1;
        System.out.println("Informe dez valores");
        recebeNum = dados.nextInt();
        while (cont<10)
        {
            numLista.add(recebeNum);
            recebeNum = dados.nextInt();
            cont++;
        }
        for(int i = 0; i < numLista.size();i++)
        {
            if (numLista.get(i)%2 ==0)
            {
                soma += numLista.get(i);
            }
        }
        System.out.println(soma);
    }
}
