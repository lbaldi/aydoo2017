package ar.edu.untref.aydoo;


public class ExceptionInvalidNumberToCalculate extends RuntimeException {

    private static final String message = "Valor ingresado incorrecto. Debe ingresar un numero natural mayor igual a dos.";

    public ExceptionInvalidNumberToCalculate() {
        super(message);
    }

}
