public class Main {
    public static void main(String[] args)
    {
        Carro fusca = new Carro();
        Carro argo = new Carro();

        fusca.marca = "Wolkswagen";
        fusca.modelo = "fusca";
        fusca.combustivel = 30;

        argo.marca = "Fiat";
        argo.modelo = "Argo 1.0";
        argo.combustivel = 45;

        System.out.println("Carro 1: "+fusca.marca);
        System.out.println("Carro 1: "+fusca.modelo);
        System.out.println("Carro 1: "+fusca.combustivel);
        fusca.acelerar();
        System.out.println("Carro 1: "+fusca.combustivel);



    }
}