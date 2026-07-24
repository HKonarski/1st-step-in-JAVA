//3. Declare duas variáveis double e realize as seguintes operações:
// soma, subtração, multiplicação e divisão;
//4. Imprima todos os resultados, um em cada linha:

import java.util.Scanner;

public class exer_03_04
{
        public static void main(String[] args)
        {
            double valor1;
            double valor2;
            double soma;
            double subtr;
            double mult;
            double div;
            Scanner dados = new Scanner(System.in);
            System.out.println("Digite um valor");
            valor1 = dados.nextDouble();
            System.out.println("digite outro valor");
            valor2 = dados.nextDouble();
            soma = valor1 + valor2;
            subtr = valor1 - valor2;
            mult = valor1 * valor2;
            div = valor1 / valor2;
            System.out.println("valor da soma é: "+soma);
            System.out.println("valor da subtração é: "+subtr);
            System.out.println("valor da multiplicação é: " +mult);
            System.out.println("valor da divisão é: " +div);

        }
}
