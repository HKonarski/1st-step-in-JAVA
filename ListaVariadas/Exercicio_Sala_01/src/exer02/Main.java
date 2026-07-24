package exer02;

public class Main
{
        public static void main(String[] args)
        {
            Produto smartphone = new Produto();
            Produto notebook = new Produto();
            Produto videogames = new Produto();

            smartphone.cadastrar("Iphone 5000", 9999.0);
            notebook.cadastrar("Macbook", 2, 499999.0);
            videogames.cadastrar("PS5", 2, 4000.0,"console");

            System.out.println("Produto Cadastrados");
            System.out.println("==============================================");
            System.out.println("Produto: "+smartphone.cadastrar());
            System.out.println("==============================================");
            System.out.println("Produto: "+notebook.cadastrar());
            System.out.println("==============================================");
            System.out.println("Produto:"+videogames.cadastrar());
        }
}
