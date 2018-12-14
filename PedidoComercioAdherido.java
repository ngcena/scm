import java.math.BigDecimal;
import java.util.Iteracto;
import java.util.List;

public class PedidoComercioAdherido {
    private List<DetallePedido> detalle;

    public PedidoComercioAdherido() {
        this.detalle = new ArrayList<>();
    }

    public BigDecimal calcularTotal() {
	BigDecimal total=BigDecimal.ZERO;
	
	for (DetallPedido detallePedido : detalle){
		total = total.add(detallePedido.calcularSubtotal());
	}

        return total;
    }
}