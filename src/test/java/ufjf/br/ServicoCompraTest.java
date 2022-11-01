package ufjf.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCompraTest {

    @Test
    void deveRealizarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra realizada com sucesso!", servico.executar());
    }

    @Test
    void deveCancelarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra cancelada com sucesso!", servico.cancelar());
    }

}