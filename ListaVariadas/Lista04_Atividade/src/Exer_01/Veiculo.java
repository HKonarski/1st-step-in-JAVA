package Exer_01;

public class Veiculo
{
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo (String marca, String modelo, int ano)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void acelerar ()
    {
        System.out.println("Veiculo acelerando");
    }
    public void frear ()
    {
        System.out.println("veiculo freando!");
    }
    public void exibirInformacoes ()
    {
        System.out.println("Marca do veiculo: " + marca);
        System.out.println("Modelo do veiculo: " + modelo);
        System.out.println("Ano do veiculo: " + ano);
    }
}