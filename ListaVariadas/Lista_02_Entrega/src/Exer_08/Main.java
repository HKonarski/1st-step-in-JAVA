package Exer_08;

public class Main
{
    public static void main(String[] args)
    {
        ItemConfiguracao item = new ItemConfiguracao(1, "Servidor de Backup");

        RepositorioGenerico sqlRepo = new RepositorioSQL();
        RepositorioGenerico noSqlRepo = new RepositorioNoSQL();

        sqlRepo.salvar(item);
        sqlRepo.buscarPorId(1);
        sqlRepo.atualizar(item);
        sqlRepo.deletar(1);

        System.out.println();

        noSqlRepo.salvar(item);
        noSqlRepo.buscarPorId(1);
        noSqlRepo.atualizar(item);
        noSqlRepo.deletar(1);
    }
}


