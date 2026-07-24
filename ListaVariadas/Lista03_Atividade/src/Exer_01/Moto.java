package Exer_01;

public class Moto extends Veiculo
{
    private boolean temBagageiro;

    public Moto (String marca, String modelo, int ano, boolean temBagageiro)
    {
        super(marca, modelo, ano);
        this.temBagageiro = temBagageiro;
    }
    public void empinar ()
    {
        System.out.println("Moto está empinando!!");
    }
    public void buzinar ()
    {
        System.out.println("Buzina acionando!!");
    }
    public void exibirInformacoesMoto ()
    {
        System.out.println("Possui bagageiro: " + (temBagageiro ? "sim" : "não"));
    }
}
