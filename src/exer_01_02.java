import java.util.Scanner;

public class exer_01_02
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in); //faz a leitura de dados
        //entrada
        int num1;
        double num2;
        char letra;
        boolean num3 = true;

        //Processamento
        System.out.println("digite um numero: ");
        num1 = dados.nextInt();
        System.out.println("Digite um numero decimal: ");
        num2 = dados.nextDouble();
        System.out.println("digite uma letra: ");
        letra = dados.next().charAt(0);

        //Saida
        System.out.println("valor inteiro é:" +num1);
        System.out.println("Valor decimal é: " +num2);
        System.out.println("A letra digitada é:" +letra);
        System.out.println("valor booleano é: " +num3);

    }
}