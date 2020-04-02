package domain;

public class Prenda {
	public static int prendaId=0;
    int tipoDePrenda;
    Estado estado;
	private int id;
	int precio;
	
    Prenda(Estado unEstado, int unTipoDePrenda){
        this.id=Prenda.prendaId++;
        this.estado=unEstado;
        this.tipoDePrenda=unTipoDePrenda;
    }

    public int precio(){
        return estado.modificacion(precio);
    }
    
    public void cambiarPrecio(int unPrecio){
        precio=unPrecio;
    }
    
}