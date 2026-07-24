import java.util.Scanner;

public class exer_14_1
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int numBase;
        int numExpo;
        double numExnm;
        System.out.println("Informe o valor da base");
        numBase = dados.nextInt();
        System.out.println("Informe o valor do expoente");
        numExpo = dados.nextInt();
        numExnm = Math.pow (numBase, numExpo);
        System.out.println("valor da exponencial: " +numExnm);

    }
}
