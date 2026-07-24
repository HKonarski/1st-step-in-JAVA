import java.util.Scanner;

/*16. Cálculo de Juros Compostos:
○ Solicite ao usuário o valor principal, a taxa de juros e o tempo, e calcule o
montante final usando juros compostos.
*********************************** M = C x (1 + i) ^ t ***********************************
M: Montante, ou seja, o valor final da aplicação
C: Capital, ou seja, o valor investido no início
i: Taxa de juros, que deve ser utilizada na forma decimal
t: Tempo de aplicação, que deve estar na mesma unidade de medida que a taxa de juros
*/
public class exer_16
{
    public static void main(String[] args)
    {
        Scanner dados =new Scanner(System.in);
        double numMont = 1;
        double numCap;
        double numTaxajuros;
        double calcMont;
        int numTemp;
        double somaMont;
        System.out.println("informe o valor de capital que deseja investir:");
        numCap = dados.nextDouble();
        System.out.println("Informe o valor da taxa de juros ao ano aplicação:");
        numTaxajuros = dados.nextDouble();
        System.out.println("Injforme o tempo em anos da aplicação");
        numTemp = dados.nextInt();
        calcMont = (1 + numTaxajuros);
        for ( int contTemp = 1; contTemp<= numTemp; contTemp++ )
        {
            numMont = numMont * calcMont;
        }
        somaMont = numCap * numMont;
        System.out.println("O valor da aplicação é R$ "+String.format("%.2f", somaMont) +" em " +numTemp+ " anos.");

    }
}
