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
2-Conocer la ganancia diaria de las prendas vendidas (Pregunta al usuario, el recargo por cuotas adicional se incorpora dentro del precio neto?
O es un beneficio para el banco por brindar el servicio?
En ese caso desea tener un registro del precio bruto(sin este adicional) y uno neto?
O desea tener el precio neto final y almacenar el procentaje de ganancia del banco?)
REQUERIMIENTOS NO FUNCIONALES: No encontra ninguno
Aclaraciones:
///El codigo tiene errores de compilacion ya que no conozco el lenguaje en su profundidad. Pero creo que se entiende en su
mayoria. Tuve problemas con el tipo Date y como el funcionamiento con los statics en las clases.
///Los pagos en Efectivo se anotan con cuota=1.
///Descarte la codificacion de todos los getters y setters que no se hacen uso.
/// El metodo hayStock lo inclui para hacer mas razonable el contexto del codigo y validar la venta. Solo se asume
la cantidad de stock y no el tipo de prenda en stock.
///Considere Macowins como una clase, de esta forma se podria asumir que cada clase Macowins es un
local de Macowins. Capaz, de momento no seria necesario pero a futuro probablemente seria conveniente
si se implenta el sistema a una escala mayor.
*/
