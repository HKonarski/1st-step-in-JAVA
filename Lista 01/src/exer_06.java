import java.util.Scanner;

//6. Verificação de Número dentro de um Intervalo:
//Peça ao usuário para inserir um número e verifique se ele está entre 10 e 20 (inclusive).
public class exer_06
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double numVerif;
        System.out.println("Informe uma valor entre 10 e 20:");
        numVerif = dados.nextDouble();

        if ((numVerif >= 10) && (numVerif <= 20))
        {
            System.out.println("valor informado está entre 10 e 20 o valor é: "+numVerif);
        }
        else if (numVerif< 10)
        {
            System.out.println("valor informado é menor que 10: "+numVerif);
        }
        else
        {
            System.out.println("valor informado é maior que 20: " +numVerif);
        }
    }
}
