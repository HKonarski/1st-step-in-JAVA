package Exercicio_10;

public class Locacao
{
    private Cliente cliente;
    private Veiculo veiculo;
    private int dias;

    public Locacao(Cliente cliente, Veiculo veiculo, int dias)
    {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
        veiculo.alugar();
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public double calcularValor()
    {
        return veiculo.getPrecoDiaria() * dias;
    }

    public void finalizar()
    {
        veiculo.devolver();
    }

    public void exibirResumo()
    {
        System.out.println("Locação: " + cliente.getNome() +
                " alugou " + veiculo.getModelo() +
                " por " + dias +
                " dias. Valor: R$" + calcularValor());
    }
}
