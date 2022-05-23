public class Pedido  {

    public boolean realizarPedido() {
        return PedidoFacade.verificaPendeciasPedido(this);
    }
}
