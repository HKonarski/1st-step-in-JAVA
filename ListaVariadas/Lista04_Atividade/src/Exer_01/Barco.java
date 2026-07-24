package Exer_01;

public class Barco extends Veiculo
{
    private int numeroDeMotor;

    public Barco (String marca, String modelo, int ano, int numeroDeMotor)
    {
        super(marca, modelo, ano);
        this.numeroDeMotor = numeroDeMotor;
    }
    public void nagevar ()
    {
        System.out.println("Barco navegando!!!");
    }
    public void ancorar ()
    {
        System.out.println("Barco ancorado!!");
    }
}
