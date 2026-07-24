import java.util.Scanner;

/*14. Cálculo de Potência:
        ○ Peça ao usuário para inserir uma base e um expoente, e calcule a potência
sem usar a função Math.pow.
                            a^n=b
    a = base;
    n = expoente;
    b = potência.

*/

public class exer_14
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int numBase;
        int numExpo;
        int numValor = 1;
        System.out.println("Informe uma base para o calculo de potência:");
        numBase = dados.nextInt();
        System.out.println("Informe um expoente para o calculo de potência");
        numExpo = dados.nextInt();
        if (numExpo == 0)
        {
            numValor = 1;
            System.out.println("valor da pontência é: "+numValor);
        }
        else if (numBase == 0)
        {
            numValor = numBase;
            System.out.println("Valor da potência é: "+numValor);

        } else
        {
            for (int contExp = 1; contExp <= numExpo; contExp++)
            {
                numValor = numValor * numBase;
            }
            System.out.println("Valor da potência é: " +numValor);
        }

    }
}
