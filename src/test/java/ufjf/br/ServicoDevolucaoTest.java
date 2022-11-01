package ufjf.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDevolucaoTest {
    @Test
    void deveRealizarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolucao");
        assertEquals("Solicitação de devolução realizada com sucesso!", servico.executar());
    }

    @Test
    void deveCancelarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolucao");
        assertEquals("Solicitação de devolução cancelada com sucesso!", servico.cancelar());
    }
}