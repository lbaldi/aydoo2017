package ar.edu.untref.aydoo;

public class Producto {

    protected String nombre;

    protected Double valor;

    public Producto(String nombre, Double valor) {
        this.nombre = nombre;
        this.asignarValor(valor);
    }

    /**
     * @return Devuelve el producto con mayor valor. En caso de que sean los dos del mismo
     * valor se prioriza el segundo.
     */
    public static Producto obtenerProductoMayorValor(Producto productoA, Producto productoB) {
        Producto productoMayorValor;
        if (productoA.obtenerValor() > productoB.obtenerValor()) {
            productoMayorValor = productoA;
        } else {
            productoMayorValor = productoB;
        }
        return productoMayorValor;
    }

    /**
     * @return Devuelve el producto con menor valor. En caso de que sean los dos del mismo
     * valor se prioriza el segundo.
     */
    public static Producto obtenerProductoMenorValor(Producto productoA, Producto productoB) {
        Producto productoMenorValor;
        if (productoA.obtenerValor() < productoB.obtenerValor()) {
            productoMenorValor = productoA;
        } else {
            productoMenorValor = productoB;
        }
        return productoMenorValor;
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
