package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Test;

public class TestPrimeFactorsProgram {

    private PrimeFactorsProgram primeFactorsProgram;

    @Before
    public void createPrinter() {
        this.primeFactorsProgram = new PrimeFactorsProgram(
                new PrimeFactorsCalculator(),
                new PrimeFactorsSorterAsc(),
                new PrimeFactorsFormatterPretty(),
                new PrimeFactorsPrinterFile("prueba.txt", "UTF-8")
        );
    }

    @Test
    public void executePrint() {
        this.primeFactorsProgram.factorize(360);
    }

}
