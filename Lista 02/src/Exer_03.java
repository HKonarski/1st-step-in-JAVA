/*
3_Armazene 7 nomes em um array e mostre os que terminam com 'a'
 */
public class Exer_03
{
    public static void main(String[] args)
    {
        String[] nomes = {"Maria", "Marcos", "Valeria", "Carol", "Isadora", "Hubens", "Carlos"};
        String nomeRecebe;
        for(int i =0; i< nomes.length; i++)
        {
            nomeRecebe = nomes[i].toLowerCase();
            if(nomeRecebe.charAt(nomeRecebe.length()-1) =='a')
            {
                System.out.println(nomeRecebe);
            }
        }
    }
}
