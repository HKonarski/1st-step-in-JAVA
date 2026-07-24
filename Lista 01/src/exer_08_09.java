//8. Cálculo de Área do Retângulo
//Peça ao usuário para inserir a base e a altura de um retângulo e calcule a área
import java.util.Scanner;

public class exer_08_09
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double numArea;
        double numPerim;
        double numBase;
        double numAltura;

        System.out.println("Informe a altura do retangulo:");
        numAltura = dados.nextDouble();
        System.out.println("Informe a base do retangulo:");
        numBase = dados.nextDouble();
        numArea = numBase * numAltura;
        numPerim = 2 * (numBase + numAltura);
        System.out.println("A area do retângulo é: " +numArea+ "cm²");
        System.out.println("o perimetro do retângulo é: "+numPerim+ "cm");

    }
}
