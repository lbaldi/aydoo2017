package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class PrimeFactorsCalcTest {

    private PrimeFactorsCalc calc;

    @Before
    public void setUp(){

        calc = new PrimeFactorsCalc();

    }

    @Test
    public void stringFactorize90(){

        String stringFactor = "Factores primos 90: 2 3 3 5";
        String result = calc.factorize(90);
        Assert.assertEquals(stringFactor, result);

    }

    @Test
    public void stringFactorize360(){

        String stringFactor = "Factores primos 360: 2 2 2 3 3 5";
        String result = calc.factorize(360);
        Assert.assertEquals(stringFactor, result);

    }

    @Test
    public void factorize360() {

        ArrayList<Integer> result = calc.getFactorsList(360);
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(2);
        factors.add(2);
        factors.add(2);
        factors.add(3);
        factors.add(3);
        factors.add(5);
        Assert.assertEquals(factors, result);

    }

    @Test
    public void factorize90() {

        ArrayList<Integer> result = calc.getFactorsList(90);
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(2);
        factors.add(3);
        factors.add(3);
        factors.add(5);
        Assert.assertEquals(factors, result);

    }

    @Test
    public void stringFactorize0(){

        String stringFactor = "Factores primos 0:";
        String result = calc.factorize(0);
        Assert.assertEquals(stringFactor, result);

    }

    @Test
    public void factorize0() {

        ArrayList<Integer> result = calc.getFactorsList(0);
        ArrayList<Integer> factors = new ArrayList<>();
        Assert.assertEquals(factors, result);

    }

    @Test
    public void factorize1() {

        ArrayList<Integer> result = calc.getFactorsList(1);
        ArrayList<Integer> factors = new ArrayList<>();
        Assert.assertEquals(factors, result);

    }

    @Test
    public void stringFactorize2(){

        String stringFactor = "Factores primos 2: 2";
        String result = calc.factorize(2);
        Assert.assertEquals(stringFactor, result);

    }

    @Test
    public void factorize2() {

        ArrayList<Integer> result = calc.getFactorsList(2);
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(2);
        Assert.assertEquals(factors, result);

    }

    @Test
    public void factorize3() {

        ArrayList<Integer> result = calc.getFactorsList(3);
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(3);
        Assert.assertEquals(factors, result);

    }

    @Test
    public void factorize4() {

        ArrayList<Integer> result = calc.getFactorsList(4);
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(2);
        factors.add(2);
        Assert.assertEquals(factors, result);

    }

}