package exer01;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        double valorReal;
        ClienteComum comum = new ClienteComum("123456789", "roberto", "(46) 999878286648");
        ClienteVip vip = new ClienteVip("987456321", "Rodrigo", "(41)986823682");
        ClienteFun fun = new ClienteFun("852741963", "Jose", "(45)96543126");

        System.out.println("Informe o valor que deseja verificar o desconto:");
        valorReal = dados.nextDouble();
        System.out.println("Valor sem desconto R$: "+valorReal);
        System.out.println("Cliente comum paga R$: "+comum.clienteDesconto(valorReal));
        System.out.println("Clinte VIP paga R$: "+vip.clienteDesconto(valorReal));
        System.out.println("Cliente Funcionario paga R$: "+fun.clienteDesconto(valorReal));
    }
}
