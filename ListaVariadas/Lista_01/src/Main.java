//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Produto celular = new Produto();
        Produto carregador = new Produto();
        Produto computador = new Produto();

        celular.nome = "Samsung";
        celular.preco = 1000.00;
        celular.quantidadeEmEstoque = 10;

        carregador.nome = "carregado samsung";
        carregador.preco = 30.00;
        carregador.quantidadeEmEstoque = 10;

        System.out.println("produto 1: "+celular.nome);
        System.out.println("estoque: " +celular.quantidadeEmEstoque);
        celular.diminuirEstoque(1);
        System.out.println("estoque novo: " +celular.quantidadeEmEstoque);
    }

}