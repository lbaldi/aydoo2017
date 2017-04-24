package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrimeFactorsCalculator {

    private IPrimeFactorsCalculator calculator;

    @Before
    public void createCalculator() {
        this.calculator = new PrimeFactorsCalculator();
    }

    @Test
    public void getPrimeFactorOf360() {
        List<Integer> factors = this.calculator.calculate(360);
        List<Integer> expectedFactors = new ArrayList<>();
        expectedFactors.addAll(Arrays.asList(2, 2, 2, 3, 3, 5));

        Assert.assertEquals(expectedFactors, factors);
    }

    @Test
    public void getPrimeFactorOf90() {
        List<Integer> factors = this.calculator.calculate(90);
        List<Integer> expectedFactors = new ArrayList<>();
        expectedFactors.addAll(Arrays.asList(2, 3, 3, 5));

        Assert.assertEquals(expectedFactors, factors);
    }

    @Test
    public void getPrimeFactorOf2() {
        List<Integer> factors = this.calculator.calculate(2);
        List<Integer> expectedFactors = new ArrayList<>();
        expectedFactors.addAll(Arrays.asList(2));

        Assert.assertEquals(expectedFactors, factors);
    }

    @Test
    public void getPrimeFactorOf3() {
        List<Integer> factors = this.calculator.calculate(3);
        List<Integer> expectedFactors = new ArrayList<>();
        expectedFactors.addAll(Arrays.asList(3));

        Assert.assertEquals(expectedFactors, factors);
    }

    @Test
    public void getPrimeFactorOf4() {
        List<Integer> factors = this.calculator.calculate(4);
        List<Integer> expectedFactors = new ArrayList<>();
        expectedFactors.addAll(Arrays.asList(2, 2));

        Assert.assertEquals(expectedFactors, factors);
    }

    @Test(expected = ExceptionInvalidNumberToCalculate.class)
    public void getPrimeFactorOf1() {
        List<Integer> factors = this.calculator.calculate(1);
    }

    @Test(expected = ExceptionInvalidNumberToCalculate.class)
    public void getPrimeFactorOf0() {
        List<Integer> factors = this.calculator.calculate(0);
    }

    @Test(expected = ExceptionInvalidNumberToCalculate.class)
    public void getPrimeFactorOfNegative90() {
        List<Integer> factors = this.calculator.calculate(-90);
    }

}
