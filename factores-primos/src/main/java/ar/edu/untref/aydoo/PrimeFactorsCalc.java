package ar.edu.untref.aydoo;

import java.util.ArrayList;

class PrimeFactorsCalc {

    String factorize(int number){

        String result = "Factores primos " + Integer.toString(number) + ":";

        for(Integer factor: getFactorsList(number)){
            result += " " + factor.toString();
        }

        return result;

    }

    /**
     * Funcion recursiva que permite obtener una lista factores
     * primos dado un numero. Para los casos que el numero sea
     * menor a dos devolvera una lista vacia.
     */
    ArrayList<Integer> getFactorsList(int number) {


        int factor = 2;

        ArrayList<Integer> factors = new ArrayList<>();

        if (number >= factor){

            while (number % factor != 0) {factor++;}

            factors.add(factor);

            factors.addAll(getFactorsList(number / factor));

        }

        return factors;

    }

}
