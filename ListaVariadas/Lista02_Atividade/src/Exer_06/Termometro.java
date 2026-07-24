package Exer_06;

import java.util.Locale;

public class Termometro
{
    private double temperaturaAtual;
    private String unidade;

    public Termometro (double temperaturaAtual, String unidade)
    {
        this.temperaturaAtual = temperaturaAtual;
        if (unidade.equalsIgnoreCase("C") || unidade.equalsIgnoreCase("F"))
        {
            this.unidade = unidade.toUpperCase();
        }
        else
        {
            this.unidade = "C";
        }
    }
    public void setTemperaturaAtual (double temp)
    {
        this.temperaturaAtual = temp;
    }
    public void converteParaF ()
    {
        if (unidade.equals("C"))
        {
            temperaturaAtual = (temperaturaAtual * 9/5) +32;
            unidade = "F";
        }
    }
    public void convertparaC ()
    {
        if (unidade.equals("F"))
        {
            temperaturaAtual = (temperaturaAtual - 32) *5/9;
            unidade = "C";
        }
    }
    public String getTemperatura ()
    {
        return String.format("%.2f °%s", temperaturaAtual, unidade);
    }
}
