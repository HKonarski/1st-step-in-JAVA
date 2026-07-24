//Verificação de Número Múltiplo:
//○ Crie um programa que verifica se um número é múltiplo de outro (ambos inseridos pelo usuário).
import java.util.Scanner;

public class exer_11
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double numMult1;
        double numMult2;
        System.out.println("informe o primeiro número");
        numMult1 = dados.nextDouble();
        System.out.println("Informe o segundo número");
        numMult2 = dados.nextDouble();

        if (numMult2 !=0)
        {
            if (numMult1 % numMult2 ==0)
            {
                System.out.println(+numMult1+ " multiplo do " +numMult2+" =]");
            }
            else
            {
                System.out.println(+numMult1+ " não é multiplo do " +numMult2+ " =/");
            }
        }
        else
        {
            System.out.println("Não é possivel dividir por zero!!");
        }
    }
}
