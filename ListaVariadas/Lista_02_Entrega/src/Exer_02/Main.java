package Exer_02;
import java.util.Date;
public class Main
{
    public static void main(String[] args)
    {
        Logger logger = new Logger();
        logger.registrarLog("Sistema iniciado");
        logger.registrarLog("Conexão instável", "WARNING");
        logger.registrarLog("Falha ao salvar dados", "ERROR", new Date());
        logger.registrarLog("Erro de autenticação", new RuntimeException("Usuário não encontrado"));

    }
}
