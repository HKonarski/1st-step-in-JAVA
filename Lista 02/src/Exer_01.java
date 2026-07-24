/*
1_Crie um array de 5 números e mostre o maior valor
 */
public class Exer_01 {
    public static void main(String[] args)
    {
        int [] numeros = {10, 15, 18, 45, 25};
        int compara = 0;
        for (int i = 0; i< numeros.length; i++)
        {
            if (compara <numeros[i])
            {
                compara = numeros[i];
            }
        }
        System.out.println(compara);
    }
}