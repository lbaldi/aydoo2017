package ar.edu.untref.aydoo;

import java.util.List;

public class PrimeFactorsFormatterPretty implements IPrimeFactorsFormatter {

    @Override
    public String format(Integer number, List<Integer> factors) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Factores primos %s: ", number));
        for (Integer factor : factors) {
            result.append(String.format("%s ", factor.toString()));
        }
        return result.toString().trim();
    }

}
