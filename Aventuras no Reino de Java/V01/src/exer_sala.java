import java.util.Scanner;

public class exer_sala
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);

        int userNum;
        int cont = 1;
        int soma = 0;
        System.out.println("informe um valor");
        userNum = dados.nextInt();

        while (cont<= userNum)
        {
            soma += cont;
            cont++;
            System.out.println("soma = "+soma+ " + "+cont);
        }
        System.out.println(soma);
    }
}
