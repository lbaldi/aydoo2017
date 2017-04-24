package ar.edu.untref.aydoo;

import java.util.List;

public class PrimeFactorsProgram {

    protected IPrimeFactorsCalculator calculator;

    protected IPrimeFactorsSorter sorter;

    protected IPrimeFactorsPrinter printer;

    protected IPrimeFactorsFormatter formatter;

    public PrimeFactorsProgram(IPrimeFactorsCalculator calculator, IPrimeFactorsSorter sorter, IPrimeFactorsFormatter formatter, IPrimeFactorsPrinter printer) {
        this.calculator = calculator;
        this.sorter = sorter;
        this.formatter = formatter;
        this.printer = printer;
    }

    protected IPrimeFactorsCalculator getCalculator() {
        return this.calculator;
    }

    protected IPrimeFactorsSorter getSorter() {
        return this.sorter;
    }

    protected IPrimeFactorsFormatter getFormatter() {
        return this.formatter;
    }

    protected IPrimeFactorsPrinter getPrinter() {
        return this.printer;
    }

    public void factorize(Integer number) {
        List<Integer> factors;
        factors = this.getCalculator().calculate(number);
        factors = this.getSorter().sort(factors);
        String formattedFactors = this.getFormatter().format(number, factors);
        this.getPrinter().print(formattedFactors);
    }

}
