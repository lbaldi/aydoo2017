package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.List;

public class QuietPrimeFactorCalcPrinter implements IPrimeFactorCalcPrinter{

    @Override
    public String print(int number, List<Integer> factors) {
        StringBuilder result = new StringBuilder();
        Collections.reverse(factors);
        for (Integer factor: factors) {
            result.append(factor).append(System.lineSeparator());
        }
        return result.toString();
    }

}
