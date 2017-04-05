package ar.edu.untref.aydoo;

/**
 * Created by Administrador on 04/04/2017.
 */
public class Suscripcion {

    private Producto producto;
    private Double descuento;

    public Suscripcion(Producto producto, Double descuento){

        this.producto = producto;
        this.descuento = descuento;

    }

    public Double obtenerValor(){

        return this.producto.obtenerValor() * (1 - descuento/100);

    }

}
