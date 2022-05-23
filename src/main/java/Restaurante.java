import java.util.ArrayList;
import java.util.List;

public abstract class Restaurante {

    private List<Pedido> pedidosComPendencia = new ArrayList<Pedido>();

    public void addPedidoPendente(Pedido pedido){
        this.pedidosComPendencia.add(pedido);
    }

    public boolean verificaPedidoComPendencia(Pedido pedido){
        return this.pedidosComPendencia.contains(pedido);
    }
}
