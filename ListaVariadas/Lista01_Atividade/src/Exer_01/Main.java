package Exer_01;

public class Main
{
    public static void main (String [] args)
    {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 2.500;
        p1.qunatidadeEmEstoque = 10;

        System.out.println("---------------****---------------");
        System.out.println("nome do item: " + p1.nome);
        System.out.println("Preço do item: "+p1.preco);
        System.out.println("Quantidade do item no estoque: "+p1.qunatidadeEmEstoque);
    }

}
