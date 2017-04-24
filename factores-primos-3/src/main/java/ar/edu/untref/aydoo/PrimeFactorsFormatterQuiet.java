package ar.edu.untref.aydoo;

import java.util.List;

public class PrimeFactorsFormatterQuiet implements IPrimeFactorsFormatter {

    public String format(Integer number, List<Integer> factors) {
        StringBuilder result = new StringBuilder();
        for (Integer factor : factors) {
            result.append(factor).append(System.lineSeparator());
        }
        int last = result.lastIndexOf("\n");
        if (last >= 0) {
            result.delete(last, result.length());
        }
        return result.toString();
    }

}
