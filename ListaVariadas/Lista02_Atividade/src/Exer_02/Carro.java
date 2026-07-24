package Exer_02;

public class Carro
{
    private String marca;
    private String modelo;
    private int ano;
    private double combustivel;

    public Carro(String marca, String modelo, int ano, double combustivel)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }
    public String getMarca()
    {
        return marca;
    }
    public String getModelo()
    {
        return modelo;
    }

    public int getAno()
    {
        return ano;
    }

    public void setCombustivel(double combustivel)
    {
        if (combustivel >= 0) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Valor inválido!!");
        }
    }
    public void exibirInformações ()
        {
            System.out.println("Marca do veiculo: "+ marca);
            System.out.println("Modelo do veiculo: " + modelo);
            System.out.println("Ano de veiculo: " + ano);
            System.out.println("Nivel de combustivel: " + combustivel);
        }
        public void acelerar (double litros)
        {
            if (litros <= combustivel) {
                combustivel -= litros;
                System.out.println("Veiculo acelerando!!");
            } else {
                System.out.println("Veiculo sem combustivel para acelerar!!");
            }
        }
        public void abastecer(double litros)
            {
                if (litros>0)
                {
                    combustivel += litros;
                    System.out.println("Abastecido " +litros + " litros. Total: " + combustivel + " em litros");
                }
                else
                {
                    System.out.println("Valor de abastecimento incorreto!!");
                }
            }
    }
