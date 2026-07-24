import java.util.ArrayList;
import java.util.Scanner;

/*
9_Preencha um ArrayList com 10 números informados pelo usuário com
Scanner e substitua os negativos por zero
 */
public class Exer_09
{
    public static void main(String[] args)
    {
        ArrayList<Double> numRecebe = new ArrayList<>();
        Scanner dados = new Scanner(System.in);
        double numLeia;
        double numModifica = 0;
        int cont=0;
        int pqSim =0;
        System.out.println("Informe dez numeros para Serem lidos:");
        do
        {
            numLeia = dados.nextDouble();
            numRecebe.add(numLeia);
            cont++;

        }while (cont<10);
        System.out.println("--------------------------------");
        for (int i = 0; i <numRecebe.size(); i++)
        {
            if (numRecebe.get(i)<0)
            {
                numRecebe.set(i, numModifica);
            }
            pqSim++;
            System.out.println(pqSim+") "+numRecebe.get(i));
        }
    }
}
