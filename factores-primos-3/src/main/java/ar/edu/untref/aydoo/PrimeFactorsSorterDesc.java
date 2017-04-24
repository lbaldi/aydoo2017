package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrimeFactorsSorterDesc implements IPrimeFactorsSorter {

    @Override
    public List<Integer> sort(List<Integer> factors) {
        Collections.sort(factors, Comparator.naturalOrder());
        Collections.reverse(factors);
        return factors;
    }

}
