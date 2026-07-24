package Exer_04;

public class Main
{
    public static void main (String [] args)
    {
        Usuario user1 = new Usuario("Higor Konarski", "higor@lindo.com", "gatinho123");
        Usuario user2 = new Usuario("Felipe Maccari", "felipechato.com", "chato123");

        System.out.println("Nome do usuario: " + user1.getNome());
        System.out.println("E-mail do usuario: " + user1.getEmail());
        System.out.println("Senha do usuario: " + user1.getSenha());
        System.out.println("-------------------***********-------------------");
        user2.exibirImformações();
        System.out.println("-------------------***********-------------------");
        user2.setEmail("felipe@chato.com");
        System.out.println("Nome do usuario: " + user2.getNome());
        System.out.println("E-mail do usuario: " + user2.getEmail());
        System.out.println("Senha do usuario: " + user2.getSenha());
        System.out.println("-------------------***********-------------------");
    }
}
