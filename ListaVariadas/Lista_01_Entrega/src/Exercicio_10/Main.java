package Exercicio_10;

public class Main
{
    public static void main(String[] args)
    {
        Loja loja = new Loja();

        Veiculo v1 = new Veiculo("ABC1234", "Carro - Onix", 150.0);
        Veiculo v2 = new Veiculo("XYZ9876", "Moto - CG 160", 90.0);

        loja.adicionarVeiculo(v1);
        loja.adicionarVeiculo(v2);

        Cliente c1 = new Cliente("Higor", "123.456.789-00");
        loja.adicionarCliente(c1);

        loja.listarVeiculos();
        loja.listarClientes();

        Locacao l1 = loja.realizarLocacao(c1, v1, 3);
        if (l1 != null) l1.exibirResumo();

        loja.listarLocacoes();

        l1.finalizar();
        loja.listarVeiculos();
    }
}
