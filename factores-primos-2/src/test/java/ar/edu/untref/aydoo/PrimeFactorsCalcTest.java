package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsCalcTest {

    @Test
    public void stringFactorize90() throws Exception {
        String stringFactor = "Factores primos 90: 2 3 3 5";
        String result = PrimeFactorsCalc.print(90, "pretty");

        Assert.assertEquals(stringFactor, result);
    }

    @Test
    public void stringFactorizeQuiet90() throws Exception {
        String stringFactor =
                5 + System.lineSeparator() +
                3 + System.lineSeparator() +
                3 + System.lineSeparator() +
                2 + System.lineSeparator();
        String result = PrimeFactorsCalc.print(90, "quiet");

        Assert.assertEquals(stringFactor, result);
    }

    @Test
    public void stringFactorize360() throws Exception {
        String stringFactor = "Factores primos 360: 2 2 2 3 3 5";
        String result = PrimeFactorsCalc.print(360, "pretty");

        Assert.assertEquals(stringFactor, result);

    }

    @Test
    public void factorize360() {
        List<Integer> result = PrimeFactorsCalc.getFactorsList(360);
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2,2,2,3,3,5));

        Assert.assertEquals(factors, result);
    }

    @Test
    public void factorize90() {
        List<Integer> result = PrimeFactorsCalc.getFactorsList(90);
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2,3,3,5));

        Assert.assertEquals(factors, result);

    }

    @Test
    public void stringFactorize0() throws Exception {
        String stringFactor = "Factores primos 0:";
        String result = PrimeFactorsCalc.print(0, "pretty");

        Assert.assertEquals(stringFactor, result);
    }

    @Test
    public void factorize0() {
        List<Integer> result = PrimeFactorsCalc.getFactorsList(0);
        List<Integer> factors = new ArrayList<>();

        Assert.assertEquals(factors, result);
    }

    @Test
    public void factorize1() {
        List<Integer> result = PrimeFactorsCalc.getFactorsList(1);
        List<Integer> factors = new ArrayList<>();

        Assert.assertEquals(factors, result);
    }

    @Test
    public void stringFactorize2() throws Exception {
        String stringFactor = "Factores primos 2: 2";
        String result = PrimeFactorsCalc.print(2, "pretty");

        Assert.assertEquals(stringFactor, result);
    }

    @Test
    public void factorize2() {
        List<Integer> result = PrimeFactorsCalc.getFactorsList(2);
        List<Integer> factors = new ArrayList<>();
        factors.add(2);

        Assert.assertEquals(factors, result);
    }

    @Test
    public void factorize3() {
        List<Integer> result = PrimeFactorsCalc.getFactorsList(3);
        List<Integer> factors = new ArrayList<>();
        factors.add(3);

        Assert.assertEquals(factors, result);
    }

    @Test
    public void factorize4() {
        List<Integer> result = PrimeFactorsCalc.getFactorsList(4);
        List<Integer> factors = new ArrayList<>();
        factors.addAll(Arrays.asList(2,2));

        Assert.assertEquals(factors, result);
    }

}