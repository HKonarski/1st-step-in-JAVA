// Referente ao exercicio 1 2.
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int numInte;
        double numDecimal;
        char caracter;
        boolean valor = true;
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite uma Valor inteiro:");
        numInte = dados.nextInt();
        System.out.println("Digite um valor Decimal");
        numDecimal = dados.nextDouble();
        System.out.println("Digite um caracter: ");
        caracter = dados.next(). charAt(0);
        System.out.println("valor digitado é: "+numInte);
        System.out.println("valor digitado é: "+numDecimal);
        System.out.println("Caracter digitado é: "+caracter);
        System.out.println("valor boelando " +valor);

    }
}