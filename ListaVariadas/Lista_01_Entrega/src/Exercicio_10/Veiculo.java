package Exercicio_10;

public class Veiculo
{
    private String placa;
    private String modelo;
    private boolean disponivel;
    private double precoDiaria;

    public Veiculo(String placa, String modelo, double precoDiaria)
    {
        this.placa = placa;
        this.modelo = modelo;
        this.precoDiaria = precoDiaria;
        this.disponivel = true; // começa disponível
    }

    public String getPlaca()
    {
        return placa;
    }
    public String getModelo()
    {
        return modelo;
    }
    public double getPrecoDiaria()
    {
        return precoDiaria;
    }
    public boolean isDisponivel()
    {
        return disponivel;
    }

    public void alugar()
    {
        disponivel = false;
    }
    public void devolver()
    {
        disponivel = true;
    }

    public void exibirInfo()
    {
        System.out.println("Placa: " + getPlaca() +
                " | Modelo: " + getModelo() +
                " | Preço diária: R$" + getPrecoDiaria() +
                " | Disponível: " + isDisponivel());
    }
}

