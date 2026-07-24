package Carro;

public class Carro
{
    private String marca;
    private String modelo;
    private double combustivel;


    public String getMarca ()
    {
        return this.marca;
    }
    public String getModelo()
    {
        return this.modelo;
    }
    public double getCombustivel ()
    {
        return this.combustivel
    }

    public void double setCombustivel (int acelerar)
    {
        if (combustivel>0)
        {
           combustivel -= 5;
        }
        else
        {
            System.out.println("carro não pode andar");
        }
    }

}
