package domain;

public class Tarjeta implements TipoDePago{
    int coeficiente;
    public int recargo(Venta venta){
        return venta.getCuotas() * coeficiente + venta.valorTotalDePrendas()/100;
    }
}
