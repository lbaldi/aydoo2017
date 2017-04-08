package ar.edu.untref.aydoo;

public abstract class ProductoSuscripcion extends Producto {

    protected Integer periodicidadMensual;

    public ProductoSuscripcion(Double valor, Integer periodicidadMensual){

        super(valor);

        this.periodicidadMensual = periodicidadMensual;

    }

    public Integer obtenerPeriodicidadMensual(){

        return this.periodicidadMensual;

    }

}
