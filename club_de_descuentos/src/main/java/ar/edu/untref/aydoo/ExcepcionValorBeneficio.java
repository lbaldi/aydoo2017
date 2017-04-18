package ar.edu.untref.aydoo;

public class ExcepcionValorBeneficio extends RuntimeException{

    private static final String mensaje = "El valor debe ser mayor a cero.";

    public ExcepcionValorBeneficio() {
        super(mensaje);
    }

}