package ar.edu.untref.aydoo;

/**
 * Entity
 */
public abstract class Producto {

    protected Double valor = 0.0;

    public Producto(Double valor) {
        this.valor = valor;
    }

    public Double obtenerValor() {
        return valor;
    }

}
