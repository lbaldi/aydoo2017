package ar.edu.untref.aydoo;

import java.util.ArrayList;

class PrimeFactorsCalc {

    /**
     *
     * @param number Numero a factorizar.
     * @param format Formato con el cual se mostrara por consola el resultado.
     * @return Resultado de la factorizacion en formato solicitado.
     * @throws Exception Error en caso de que el formato solicitado no sea correcto.
     */
    public static String print(int number, String format) throws Exception {
        IPrimeFactorCalcPrinter factorCalcPrinter;
        if (format == null || format.equalsIgnoreCase("PRETTY")) {
            factorCalcPrinter = PRIME_FACTORS_PRINT_TYPE.PRETTY.getPrinter();
        }
        else if (format.equalsIgnoreCase("QUIET")) {
            factorCalcPrinter = PRIME_FACTORS_PRINT_TYPE.QUIET.getPrinter();
        }
        else {
            throw new Exception("Formato no aceptado. Las opciones posibles son: pretty o quiet.");
        }
        return factorCalcPrinter.print(number, getFactorsList(number));
    }

    /**
     * Funcion recursiva que permite obtener una lista factores
     * primos dado un numero. Para los casos que el numero sea
     * menor a dos devolvera una lista vacia.
     */
    static ArrayList<Integer> getFactorsList(int number) {
        int factor = 2;
        ArrayList<Integer> factors = new ArrayList<>();
        if (number >= factor) {
            while (number % factor != 0) {
                factor++;
            }
            factors.add(factor);
            factors.addAll(getFactorsList(number / factor));
        }
        return factors;
    }

}