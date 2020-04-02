package domain;

public class Promocion implements Estado {
    int valor;
    
    public int modificacion(int unPrecio){
        return unPrecio-valor;
    }
}
