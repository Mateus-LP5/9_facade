import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPedidoSemPendencia() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.realizarPedido());
    }

    @Test
    void deveRetornarPendenciaCozinhaPedido() {
        Pedido pedido = new Pedido();
        Cozinha.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.realizarPedido());
    }

    @Test
    void deveRetornarPendenciaArmazemPedido() {
        Pedido pedido = new Pedido();
        Armazem.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.realizarPedido());
    }
}