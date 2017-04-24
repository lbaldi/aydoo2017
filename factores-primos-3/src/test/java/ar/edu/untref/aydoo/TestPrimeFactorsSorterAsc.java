package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrimeFactorsSorterAsc {

    private IPrimeFactorsSorter sorter;

    @Before
    public void createSorter() {
        this.sorter = new PrimeFactorsSorterAsc();
    }

    @Test
    public void orderFactorArrayWithSixItems() {
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2, 3, 2, 2, 3, 5));
        List<Integer> sortedFactors = this.sorter.sort(factors);
        List<Integer> expectedArray = new ArrayList<>();
        expectedArray.addAll(Arrays.asList(2, 2, 2, 3, 3, 5));

        Assert.assertEquals(expectedArray, sortedFactors);
    }

    @Test
    public void orderFactorArrayWithOneItem() {
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2));
        List<Integer> sortedFactors = this.sorter.sort(factors);
        List<Integer> expectedArray = new ArrayList<>();
        expectedArray.addAll(Arrays.asList(2));

        Assert.assertEquals(expectedArray, sortedFactors);
    }

    @Test
    public void orderFactorArrayWithNoItem() {
        List<Integer> factors = new ArrayList<>();
        List<Integer> sortedFactors = this.sorter.sort(factors);
        List<Integer> expectedArray = new ArrayList<>();

        Assert.assertEquals(expectedArray, sortedFactors);
    }

}
