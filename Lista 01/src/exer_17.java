/*17. Crie um programa que solicita ao usuário seu peso e altura e calcula o Índice de
        Massa Corporal (IMC). Em seguida, exibe a classificação de acordo com o IMC;
        ○ IMC menor que 18,5 - Abaixo do peso;
        ○ IMC entre 18,5 e 24,9 - Peso normal;
        ○ IMC entre 25,0 e 29,9 - Sobrepeso;
        ○ IMC entre 30,0 e 34,9 - Obesidade grau 1;
        ○ IMC entre 35,0 e 39,9 - Obesidade grau 2;
        ○ IMC igual ou maior que 40,0 - Obesidade grau 3 (obesidade mórbida);
 */
import java.util.Scanner;

public class exer_17
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double num1;
        double num2;
        double imc;
        System.out.println("Digite seu peso: ");
        num1 = dados.nextDouble();
        System.out.println("Digite sua altura: ");
        num2 = dados.nextDouble();
        imc = num1 / (num2 * num2);
        System.out.printf("Seu IMC é: "+imc);
        if (imc < 18.5)
        {
            System.out.printf(" Abaixo do peso");
        }
        else if ((imc>=18.5)&&(imc<= 24.9))
        {
            System.out.printf(" Peso normal");
        }
        else if ((imc>25)&&(imc<=29.9))
        {
            System.out.printf(" Sobrepeso");
        }
        else if ((imc>30)&&(imc<=34.9))
        {
            System.out.printf(" Obesidade grau 1");
        }
        else if ((imc>35)&&(imc<=39.9))
        {
            System.out.printf(" Obesidade grau 2");
        }
        else
        {
            System.out.printf(" Obesidade grau 3 (obesidade mórbida)");
        }

    }
}

