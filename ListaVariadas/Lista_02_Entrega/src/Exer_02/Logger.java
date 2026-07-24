
package Exer_02;
import java.util.Date;
public class Logger
{
    public void registrarLog(String mensagem)
    {
        System.out.println("[INFO] " + mensagem);
    }

    public void registrarLog(String mensagem, String nivel)
    {
        System.out.println("[" + nivel.toUpperCase() + "] " + mensagem);
    }

    public void registrarLog(String mensagem, String nivel, Date dataHora)
    {
        System.out.println("[" + nivel.toUpperCase() + "] " + mensagem + " | Data/Hora: " + dataHora);
    }

    public void registrarLog(String mensagem, Exception excecao)
    {
        System.out.println("[ERROR] " + mensagem + " | Exceção: " + excecao.getClass().getSimpleName() + " - " + excecao.getMessage());
    }
}