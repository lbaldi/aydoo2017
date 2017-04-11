package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class PrettyPrimeFactorCalcPrinter implements IPrimeFactorCalcPrinter{

    @Override
    public String print(int number, ArrayList<Integer> factors){
        StringBuilder result = new StringBuilder(
            String.format("Factores primos %s:", Integer.toString(number))
        );
        for(Integer factor: factors) {
            result.append(String.format(" %s", factor.toString()));
        }
        return result.toString();
    }

}
