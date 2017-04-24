package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrimeFactorsFormatterQuiet {

    private IPrimeFactorsFormatter formatter;

    @Before
    public void createFormatter() {
        this.formatter = new PrimeFactorsFormatterQuiet();
    }

    @Test
    public void formatArrayWithSixItems() {
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2, 2, 2, 3, 3, 5));
        String formattedArrayString = this.formatter.format(360, factors);
        String expectedString = 2 + System.lineSeparator() +
                2 + System.lineSeparator() +
                2 + System.lineSeparator() +
                3 + System.lineSeparator() +
                3 + System.lineSeparator() +
                5;

        Assert.assertEquals(expectedString, formattedArrayString);
    }

    @Test
    public void formatArrayWithOneItem() {
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2));
        String formattedArrayString = this.formatter.format(2, factors);
        String expectedString = "2";

        Assert.assertEquals(expectedString, formattedArrayString);
    }

    @Test
    public void formatArrayWithNoItems() {
        List<Integer> factors = new ArrayList<>();
        String formattedArrayString = this.formatter.format(null, factors);
        String expectedString = "";

        Assert.assertEquals(expectedString, formattedArrayString);
    }

}
