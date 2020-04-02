package domain;


import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Macowins {
	public static void main(String args[]) {
 System.out.println("Bienvenidos a Macowins");
}
	int stock;
    List<Dia> dias;
    int id_sucursal;

    Macowins(int id,int unStock){
        this.id_sucursal = id;
    	this.stock  = unStock;
        this.dias = new LinkedList<>();
    }

    private double gananciaTotalDeDias(){
        return dias.stream().mapToInt( dia -> dia.ganancia() ).sum();
    }

    private boolean hayStock(int unaCantidad){
        return stock>=unaCantidad;
    }

    public boolean validarVenta(Venta venta){
        return hayStock(venta.cantidadDePrendas());
    }

    public void realizarVenta(int cantidad){
        stock -= cantidad;
    }
}

/*
Requeremientos:
REQUERIMIENTOS FUNCIONALES: 
1-Saber precio,estado y tipo de una prenda
2-Conocer la ganancia diaria de las prendas vendidas en un dia (Pregunta al usuario, el recargo por cuotas adicional se incorpora dentro del precio neto?
O es un beneficio para el banco por brindar el servicio?
En ese caso desea tener un registro del precio bruto(sin este adicional) y uno neto?
O desea tener el precio neto final y almacenar el procentaje de ganancia del banco?)
REQUERIMIENTOS NO FUNCIONALES: No encontra ninguno
Aclaraciones:
Concidere que seria recomendable crear la clase Macowins y ponerle una id_sucursal, sino hubiera creado un objeto conocido.
El tipo de prenda no lo concidere importante para hacer una clase, solo un int que se relacione con cada tipo.
*/
