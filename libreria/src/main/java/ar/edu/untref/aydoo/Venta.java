package ar.edu.untref.aydoo;

/**
 * Value Object
 * Agreggate
 */
public class Venta {

    protected Integer mes;

    protected Producto producto;

    protected Cliente cliente;

    public Venta(int mes, Producto producto, Cliente cliente){
        this.mes = mes;
        this.producto = producto;
        this.cliente = cliente;
    }

    public int obtenerMes(){
        return this.mes;
    }

    public Producto obtenerProducto(){
        return this.producto;
    }

    public Cliente obtenerCliente() {
        return this.cliente;
    }

    public Double obtenerValor(){
        return this.obtenerProducto().obtenerValor();
    }

}
