package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator implements IPrimeFactorsCalculator {

    public static final Integer BASE_PRIME_FACTOR = 2;

    private void validateNumber(Integer number) {
        if (number < BASE_PRIME_FACTOR) {
            throw new ExceptionInvalidNumberToCalculate();
        }
    }

    /**
     * Funcion recursiva que permite obtener una lista factores
     * primos dado un numero. Para los casos que el numero sea
     * menor a dos devolvera una lista vacia.
     */
    public List<Integer> calculate(Integer number) {

        this.validateNumber(number);
        Integer factor = BASE_PRIME_FACTOR;
        List<Integer> factors = new ArrayList<>();
        while (number % factor != 0) {
            factor++;
        }
        factors.add(factor);
        Integer remaining = number / factor;
        if (remaining >= BASE_PRIME_FACTOR) {
            factors.addAll(calculate(remaining));
        }
        return factors;
    }

}
