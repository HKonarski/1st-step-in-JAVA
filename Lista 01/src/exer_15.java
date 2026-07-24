/*15. Cálculo de Desconto Progressivo:
○ Peça ao usuário o valor de um produto e aplique descontos progressivos:
○ 10% para compras acima de 100;
○ 20% para compras acima de 200;
○ 30% para compras acima de 300;
○ 50% para compras acima de 800;
*/

import java.util.Scanner;

public class exer_15
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double valorPagar;
        double valorDesc;

        System.out.println("Informe o valor que deseja pagar:");
        valorPagar = dados.nextDouble();

        if (valorPagar<= 100)
        {
            valorDesc = valorPagar;
            System.out.println("valor pago: "+valorDesc);
        }
        else if (valorPagar>100 && valorPagar<=200)
        {
            valorDesc = valorPagar - (valorPagar * 0.10);
            System.out.println("valor pago com 10% de desconto: "+valorDesc);
        }
        else if (valorPagar>200 && valorPagar<=300)
        {
            valorDesc = valorPagar - (valorPagar * 0.20);
            System.out.println("Valor pago com 20% de desconto: "+valorDesc);
        }
        else if (valorPagar>300 && valorPagar<=800)
        {
            valorDesc = valorPagar - (valorPagar * 0.30);
            System.out.println("Valor pago com 30% de desconto: "+valorDesc);
        }
        else if (valorPagar>800)
        {
            valorDesc = valorPagar - (valorPagar * 0.50);
            System.out.println("Valor pago com 50% de desconto: "+valorDesc);
        }
    }
}
