package ar.edu.untref.aydoo;

public class ExcepcionPorcentajeDescuentoEstablecimiento extends RuntimeException {

    private static final String mensaje = "El porcentaje de descuento no puede menor a 5.";

    public ExcepcionPorcentajeDescuentoEstablecimiento() {
        super(mensaje);
    }

}
