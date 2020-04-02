package domain;

import java.util.List;
import java.util.stream.Collectors;

public class Dia {
    int id_fecha;
	List<Venta> ventas;
	int ganancia() {
	return ventas.stream().mapToInt( venta -> venta.ganacia() ).sum();
	}
	void ingresarVenta(Venta venta) {
		ventas.add(venta);
	}
	int cantidadDeVentas() {
		return ventas.size();
	}
}
