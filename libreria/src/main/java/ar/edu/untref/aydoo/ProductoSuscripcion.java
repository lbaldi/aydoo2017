package ar.edu.untref.aydoo;

/**
 * Entity
 */
public abstract class ProductoSuscripcion extends Producto {

    protected Integer periodicidadMensual;

    public ProductoSuscripcion(Double valor, Integer periodicidadMensual) {
        super(valor);
        this.periodicidadMensual = periodicidadMensual;
    }

    public Integer obtenerPeriodicidadMensual() {
        return this.periodicidadMensual;
    }

}
