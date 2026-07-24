package Exer_03;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ProcessadorDados pd = new ProcessadorDados();
        pd.processar("Olá, mundo!");
        pd.processar(Arrays.asList("Ana", "Bruno", "Carlos"));
        pd.processar(new int[]{10, 20, 30, 40});
        pd.processar(new int[]{5, 15, 25}, true);
    }

}