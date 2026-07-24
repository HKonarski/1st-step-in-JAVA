package Exer_03;
import java.util.List;
import java.util.Arrays;

public class ProcessadorDados
{

    public void processar(List<String> nomes)
    {
        System.out.println("Processando lista de nomes:");
        for (String nome : nomes)
        {
            System.out.println("- " + nome);
        }
    }
    public void processar(String texto)
    {
        System.out.println("Texto recebido: " + texto);
        System.out.println("Tamanho do texto: " + texto.length());
    }
    public void processar(int[] numeros)
    {
        if (numeros.length == 0)
        {
            System.out.println("Array vazio.");
            return;
        }
        double media = Arrays.stream(numeros).average().orElse(0);
        System.out.println("Média dos números: " + media);
    }
    public void processar(int[] numeros, boolean mostrarMaximo)
    {
        processar(numeros);
        if (mostrarMaximo)
        {
            int maximo = Arrays.stream(numeros).max().orElse(Integer.MIN_VALUE);
            System.out.println("Valor máximo: " + maximo);
        }
    }
}

