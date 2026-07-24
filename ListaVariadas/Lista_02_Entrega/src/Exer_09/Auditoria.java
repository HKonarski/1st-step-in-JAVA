package Exer_09;

import java.util.Date;

public interface Auditoria
{
    void registrarAcao(String acao);
    Date dataUltimaAlteracao();

    default void exibirHistorico()
    {
        System.out.println("Histórico de ações auditadas disponível para consulta.");
    }
}