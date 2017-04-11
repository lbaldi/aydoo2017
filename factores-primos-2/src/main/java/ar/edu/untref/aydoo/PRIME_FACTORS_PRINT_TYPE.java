package ar.edu.untref.aydoo;

public enum PRIME_FACTORS_PRINT_TYPE {

    PRETTY(new PrettyPrimeFactorCalcPrinter()),
    QUIET(new QuietPrimeFactorCalcPrinter());

    private IPrimeFactorCalcPrinter printer;

    PRIME_FACTORS_PRINT_TYPE(IPrimeFactorCalcPrinter primeFactorCalcPrinter) {
        printer = primeFactorCalcPrinter;
    }

    public IPrimeFactorCalcPrinter getPrinter(){
        return printer;
    }

}