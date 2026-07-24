package Exercicio_07;

public class Main
{
     public static void main(String[] args)
     {
          Escola escola = new Escola();

          Aluno aluno1 = new Aluno("Carlos", 20, "123456789", 1001, "Engenharia");
          aluno1.adicionarNota(8.5);
          aluno1.adicionarNota(7.0);

          Professor prof1 = new Professor("Maria", 40, "987654321", 5000, "Matemática");

          escola.cadastroAluno(aluno1);
          escola.cadastroProfessor(prof1);

          escola.listarAlunos();
          escola.listarProfessores();

          System.out.println("=== Busca por CPF ===");
          Pessoa p = escola.buscarPessoaPorCPF("987654321");
          if (p != null)
          {
               p.exibirInformacoes();
          } else
          {
               System.out.println("Pessoa não encontrada.");
          }
     }
}
