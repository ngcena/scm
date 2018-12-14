import java.math.BigDecimal;
import java.util.Iteracto;
import java.util.List;

	for (DetallPedido detallePedido : detalle){
public class PedidoComercioAdherido {
    private List<DetallePedido> detalle;

    public PedidoComercioAdherido() {
        this.detalle = new ArrayList<>();

    }
    public BigDecimal calcularTotal() {
	BigDecimal total=BigDecimal.ZERO;
	
		total = total.add(detallePedido.calcularSubtotal());
	}

        return total;
    }
}