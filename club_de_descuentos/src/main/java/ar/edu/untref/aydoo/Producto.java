package ar.edu.untref.aydoo;

public class Producto {

    protected String nombre;

    protected Double valor;

    public Producto(String nombre, Double valor) {
        this.nombre = nombre;
        this.asignarValor(valor);
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public Double obtenerValor() {
        return this.valor;
    }

    protected void asignarValor(Double valor) {
        if (valor <= 0.0) {
            throw new ExcepcionValorProducto();
        }
        this.valor = valor;
    }

}
