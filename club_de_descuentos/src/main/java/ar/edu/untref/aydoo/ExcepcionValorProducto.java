package ar.edu.untref.aydoo;

public class ExcepcionValorProducto extends RuntimeException {

    private static final String mensaje = "El valor debe ser mayor a cero.";

    public ExcepcionValorProducto() {
        super(mensaje);
    }

}