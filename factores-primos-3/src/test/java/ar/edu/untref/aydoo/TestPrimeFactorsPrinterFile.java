package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Test;

public class TestPrimeFactorsPrinterFile {

    private IPrimeFactorsPrinter printer;

    @Before
    public void createPrinter() {
        this.printer = new PrimeFactorsPrinterFile("target/prueba.txt", "UTF-8");
    }

    @Test(expected = RuntimeException.class)
    public void createPrinterWithInvalidPath() {
        IPrimeFactorsPrinter printer = new PrimeFactorsPrinterFile("PATHINVALIDO/prueba.txt", "UTF-8");
        printer.print("..");
    }

    @Test
    public void executePrint() {
        this.printer.print("Prueba");
    }

}
