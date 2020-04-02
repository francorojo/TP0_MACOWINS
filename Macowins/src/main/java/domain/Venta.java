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

public class Venta {
	List<Prenda> prendas;
    int cuotas;
    TipoDePago tipoDePago;
    int id_venta;
    
    
    Venta(int id,TipoDePago unTipoDePago,int cuotas){
        this.id_venta = id;
    	this.tipoDePago = unTipoDePago;
        this.cuotas = cuotas;
        this.prendas = new LinkedList();
    }

    public int cantidadDePrendas(){
        return prendas.size();    }

    public int getCuotas(){
        return cuotas;
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }
    
    public void realizarVenta(Dia dia,Macowins sucursal){
        if(sucursal.validarVenta(this)){
            sucursal.realizarVenta(this.cantidadDePrendas());
            dia.ingresarVenta(this);
        }}
        
        public int ganacia(){
            return this.valorTotalDePrendas() + tipoDePago.recargo(this);
        }
        public int valorTotalDePrendas(){
            return prendas.stream().mapToInt(prenda -> prenda.precio()).sum();
        }

}
