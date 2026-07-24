import java.util.Scanner;
/*
4_Crie um Object[] com: seu nome String), sua idade Integer) e altura
Double), depois mostre cada valor
 */
public class Exer_04
{
    public static void main(String[] args)
    {
        Object[] cadastro = new Object[3];
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        cadastro[0] = dados.nextLine();
        System.out.println("Informe a sua idade:");
        cadastro[1] = dados.nextInt();
        System.out.println("Informe a sua altura:");
        cadastro[2] = dados.nextDouble();
        System.out.println("\nSeus dados informados são:");

        for (int i =0; i< cadastro.length; i++)
        {
            System.out.println(cadastro[i]);
        }
    }
}
