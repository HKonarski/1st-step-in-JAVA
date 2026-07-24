
public class Main
{
    public static void main(String[] args)
    {
        Class_produto notebook = new Class_produto("Acer Nitro 5", 5.500, 10);
        Class_produto  tv = new Class_produto("Samsung 55", 5.500, 5);

        System.out.println(notebook.getNome());
        System.out.println("valor R$: "+notebook.getPreco());
        System.out.println(notebook.getQuantidadeDeprodutos());

        notebook.setQuantidadeDeprodutos(10);

        System.out.println("Nova quantidade " + notebook.getQuantidadeDeprodutos());

    }
}