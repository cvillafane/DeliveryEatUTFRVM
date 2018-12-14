master
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class PedidoComercioAdherido{

private List<DetallePedido> detalle;

public PedidoComercioAdherido(){
this.detalle= new ArrayLit<>();
}

public BigDecimal calcularTotal(){
//TODO implementar cálculo de total con recorrida de detalle
return total;
}
}