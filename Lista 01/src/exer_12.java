/* 12. Cálculo de Salário Líquido:
○ Peça ao usuário para inserir o salário bruto e calcule o salário líquido,
considerando um desconto fixo de 10% */
import java.util.Scanner;

public class exer_12
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double salario;
        double salaDescon;
        System.out.println("Informe o seu salário bruto:");
        salario = dados.nextDouble();
        salaDescon = salario - (salario * 0.10);
        System.out.println("Se salário liquido é: "+salaDescon);
    }
}
