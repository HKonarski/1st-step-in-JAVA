import java.util.Scanner;

/*13. Cálculo de Idade em Dias:
○ Solicite ao usuário sua idade em anos e converta para dias (considere anos
bissextos)*/
public class exer_13
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        int idade;
        int multIdade;
        int somaBi = 0;
        int calcBi;
        int idadeDia;

        System.out.println("Informe a sua idade em anos");
        idade = dados.nextInt();
        multIdade = idade * 365;
        calcBi = 2025 - idade;
        for (int contBi = calcBi; contBi < 2025; contBi++)
        {
            if ((contBi % 4 ==0)&&(contBi % 100 !=100) ||(contBi % 400==0))
            {
                somaBi++;
            }
        }
        idadeDia = multIdade + somaBi;
        System.out.printf("qunatidade de anos bissextos são " +somaBi+ " anos, ");
        System.out.println("Sua idade em dias é: "+idadeDia+ " dias.");
    }
}
