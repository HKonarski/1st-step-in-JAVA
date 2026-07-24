import java.util.Scanner;

//5. Verificação de Número Positivo, Negativo e Zero
//Crie um programa que verifica pede um numero para o usuário, e retorna se é positivo, negativo ou zero:
public class exer_05
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double numComp;
        System.out.println("Informa uma valor:");
        numComp = dados.nextDouble();
        if (numComp >0)
        {
            System.out.println("valor informado é positivo!!");
        }else if (numComp< 0)
        {
            System.out.println("valor informado é negativo!!");
        }
        else
        {
            System.out.println("valor informado é ZERO!!");
        }
    }
}
