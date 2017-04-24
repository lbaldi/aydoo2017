package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrimeFactorsFormatterPretty {

    private IPrimeFactorsFormatter formatter;

    @Before
    public void createFormatter() {
        this.formatter = new PrimeFactorsFormatterPretty();
    }

    @Test
    public void formatArrayWithSixItems() {
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2, 2, 2, 3, 3, 5));
        String formattedArrayString = this.formatter.format(360, factors);
        String expectedString = "Factores primos 360: 2 2 2 3 3 5";

        Assert.assertEquals(expectedString, formattedArrayString);
    }

    @Test
    public void formatArrayWithOneItem() {
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2));
        String formattedArrayString = this.formatter.format(2, factors);
        String expectedString = "Factores primos 2: 2";

        Assert.assertEquals(expectedString, formattedArrayString);
    }

    @Test
    public void formatArrayWithNoItems() {
        List<Integer> factors = new ArrayList<>();
        String formattedArrayString = this.formatter.format(null, factors);
        String expectedString = "Factores primos null:";

        Assert.assertEquals(expectedString, formattedArrayString);
    }

}
