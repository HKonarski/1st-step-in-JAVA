/*18. Crie um programa que lê um ano e verifica se ele é bissexto. Um ano é bissexto se:
        ○ É divisível por 4, mas não por 100, ou
        ○ É divisível por 400
*/
import java.util.Scanner;

public class exer_18
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int num1;
        System.out.println("qual ano você quer verficar se é Bissexto:");
        num1 = dados.nextInt();
        if ((num1 % 4 ==0)&&(num1 % 100 !=100) ||(num1 % 400==0))
        {
            System.out.println("O ano " +num1+ " é bissexto");
        }
        else
        {
            System.out.println("O ano " +num1+ " não é bissexto");
        }

    }
}