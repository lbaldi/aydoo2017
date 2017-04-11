package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalc {

    public static String factorize(int number) {
        StringBuilder result = new StringBuilder(
                String.format("Factores primos %s:",Integer.toString(number))
        );
        for (Integer factor: getFactorsList(number)) {
            result.append(String.format(" %s", factor));
        }
        return result.toString();
    }

    /**
     * Funcion recursiva que permite obtener una lista factores
     * primos dado un numero. Para los casos que el numero sea
     * menor a dos devolvera una lista vacia.
     */
    public static List<Integer> getFactorsList(int number) {
        int factor = 2;
        List<Integer> factors = new ArrayList<>();
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
