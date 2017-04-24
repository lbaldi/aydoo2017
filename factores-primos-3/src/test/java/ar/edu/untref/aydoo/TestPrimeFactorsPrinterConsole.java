package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Test;

public class TestPrimeFactorsPrinterConsole {

    private IPrimeFactorsPrinter printer;

    @Before
    public void createPrinter() {
        this.printer = new PrimeFactorsPrinterConsole();
    }

    @Test
    public void executePrint() {
        this.printer.print(null);
    }

}
