import java.util.Scanner;

/*
22. Crie um programa bancário para um usuário controlar seu dinheiro.
Exiba para o usuário o saldo atual de sua conta (um valor qualquer), e então mostre
um menu ao usuário com 3 opções:
     1 - Ver saldo;
     2 - Sacar dinheiro
○ Solicite ao usuário o valor, e veja se é possível sacar, e caso seja, remova o
valor do saldo e mostre o saldo atualizado;
     3 - Depositar dinheiro
○ Solicite o valor ao usuário, e deposite o valor no saldo e exiba o saldo
atualizado;
4 - Sair
*/
public class exer_22
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double movi; // recebe o valor que deseja movimentar
        double saldo = 500; // saldo na conta bancaria
        double altemovi; // recebe o valor de saque ou deposito
        int numCase; // entra no switch case
        do
        {
            System.out.println("Digite 1, para ver seu saldo");
            System.out.println("Digite 2, para sacar");
            System.out.println("Digite 3, para depositar");
            System.out.println("Digite 4, para sair");
            numCase = dados.nextInt();
            switch (numCase)
            {
                case 1:
                    System.out.println("O saldo da sua conta é: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja sacar");
                    movi = dados.nextDouble();
                    altemovi = saldo - movi;
                    System.out.println(" valor sacado é : " + movi);
                    System.out.println("Seu saldo é: " + altemovi);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja depositar");
                    movi = dados.nextDouble();
                    altemovi = saldo + movi;
                    System.out.println(" valor depositado é : " + movi);
                    System.out.println("Seu saldo é: " + altemovi);
                    break;
                case 4:
                    System.out.println(" você está saindo da conta");
                    break;
                default:
                    System.out.println("Valor informado incorreto");


            }
        } while ((numCase !=1) && (numCase !=2) && (numCase !=3) && (numCase !=4));
    }
}
