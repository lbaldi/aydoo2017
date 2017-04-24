package ar.edu.untref.aydoo;

public class ExceptionInvalidParameterSorter extends RuntimeException {

    private static final String message = "Orden no aceptado. Las opciones posibles son: asc o desc.";

    public ExceptionInvalidParameterSorter() {
        super(message);
    }

}