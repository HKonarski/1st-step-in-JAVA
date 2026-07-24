package Exer_01;

public class Carro extends Veiculo
{
    private int numeroPortas;

    public Carro (String marca, String modelo, int ano, int numeroPortas)
    {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }
    public void ligarArCondicionado()
    {
        System.out.println("Ar-condicionado ligado!!");
    }
    public void abrirPortas ()
    {
        System.out.println("As " + numeroPortas + " portas foram abertas");
    }
}
