import java.util.Random;
import java.util.Scanner;

/*
21. Crie um programa onde o usuário digita um número e escolhe entre par ou ímpar. O
programa gera um número aleatório entre 0 e 10 e informa se o usuário ganhou ou
perdeu.
Utilize Scanner, if, switch case e ifs aninhados.
 */
public class exer_21
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        Random numRandom = new Random();
        int numUser;
        int ParImpar;
        int soma;
        System.out.println("digite um numero de 0 a 10");
        numUser = dados.nextInt();
        System.out.println("Informe 0 PAR e 1 para IMPAR:");
        ParImpar = dados.nextInt();
        soma = numUser + numRandom.nextInt(10);
        if ((ParImpar == 0) && (soma % 2 ==0))
        {
            System.out.println("PARABENS!! você VENCEU você escolheu PAR");
        }
        else if ((ParImpar == 1) && (soma % 2 !=0))
        {
            System.out.println("PARABENS!! você VENCEU, você escolhe IMPAR");
        }
        else
        {
            System.out.println("você perdeu");
        }







    }
}
