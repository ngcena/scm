import java.math.BigDecimal;
import java.util.Iteracto;
import java.util.List;

public class PedidoComercioAdherido {

    private List<DetallePedido> detalle;

    public PedidoComercioAdherido() {
        this.detalle = new ArrayList<>();
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;

        Iterator<DetallePedido> iter = detalle.iterator();
        while iter.hasNext(): {
            total = total.add(iter.next().calcularSubTotal());
        }
        return total;
    }
}