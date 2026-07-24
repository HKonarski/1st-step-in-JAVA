/* 20. Crie um programa que peça dois números ao usuário e uma operação (+, -, *, /).
        Com um switch case, execute a operação escolhida e mostre o resultado.
*/
import java.util.Scanner;

public class exer_20
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double num1;
        double num2;
        double calcNum;
        int numCase;
        System.out.println("Informe o primeiro valor que você deseja realizar a opração matematica:");
        num1 = dados.nextDouble();
        System.out.println("Informe o segundo valor que voc~e deseja realizar a operação matematica");
        num2 = dados.nextDouble();
        do
        {
        System.out.println("informe 1, Soma");
        System.out.println("informe 2, Subtração");
        System.out.println("informe 3, Multiplicação");
        System.out.println("Informe 4, divisão");
        numCase = dados.nextInt();

    switch (numCase)
            {
        case 1:
            calcNum = num1 + num2;
            System.out.println("O valor da soma é: " + calcNum);
            break;
        case 2:
            calcNum = num1 - num2;
            System.out.println("O valor da subtração é: " + calcNum);
            break;
        case 3:
            calcNum = num1 * num2;
            System.out.println("O valor da multiplicação é: " + calcNum);
            break;
        case 4:
            calcNum = num1 / num2;
            System.out.println("O valor da Subtração é: " + calcNum);
            break;
        default:
            System.out.println("valor informado incorreto!!\nPor informe um valor dentro da categoria abaixo:");
            }
        } while ((numCase !=1) && (numCase !=2) && (numCase !=3) && (numCase !=4));
    }
}
