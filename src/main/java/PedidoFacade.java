public class PedidoFacade {

    public static boolean verificaPendeciasPedido(Pedido pedido) {
        if (Cozinha.getInstancia().verificaPedidoComPendencia(pedido)) {
            return false;
        }
        if (Armazem.getInstancia().verificaPedidoComPendencia(pedido)) {
            return false;
        }
        return false;
    }
}
