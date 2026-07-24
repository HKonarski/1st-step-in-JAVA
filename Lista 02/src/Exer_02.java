/*
2_Preencha um array com 10 números e conte quantos são maiores que 10
 */
public class Exer_02
{
    public static void main(String[] args)
    {
        int[] numeros = {2, 1, 10, 5, 9, 45, 12, 11, 6, 78};
        int compara = 0;
        for (int i = 0; i< numeros.length; i++)
        {
            if (numeros[i]>=10)
            {
                compara = numeros[i];
                System.out.println(compara);
            }
        }
    }
}
