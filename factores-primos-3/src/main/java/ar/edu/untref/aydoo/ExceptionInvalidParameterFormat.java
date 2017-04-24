package ar.edu.untref.aydoo;

public class ExceptionInvalidParameterFormat extends RuntimeException {

    private static final String message = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";

    public ExceptionInvalidParameterFormat() {
        super(message);
    }

}
