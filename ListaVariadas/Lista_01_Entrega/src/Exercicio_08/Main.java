package Exercicio_08;

public class Main
{
    public static void main (String [] args)
    {
        Retangulo retangulo = new Retangulo("Azul", 5, 6);
        Circulo circulo = new Circulo("amarelo", 4);
        Triangulo triangulo =new Triangulo("Vermelho", 6, 6);

        retangulo.exibirInformacoes();
        System.out.println("-----------------**********-----------------");
        circulo.exibirInformacoes();
        System.out.println("-----------------**********-----------------");
        triangulo.exibirInformacoes();

    }


}
