package ar.edu.untref.aydoo;

public class ExcepcionValorMinimoDosPorUno extends RuntimeException {

    private static final String mensaje = "El valor minimo para poder aplicar dos por uno es 100.0 .";

    public ExcepcionValorMinimoDosPorUno() {
        super(mensaje);
    }

}
