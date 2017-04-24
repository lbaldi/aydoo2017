package ar.edu.untref.aydoo;

public class Program {

    public static void main(String args[]) {
        String parameterFormat = null;
        String parameterSort = null;
        String parameterOutputFile = null;
        for (String arg : args) {
            if (arg.startsWith("--format=")) {
                parameterFormat = arg.replace("--format=", "").toUpperCase();
            } else if (arg.startsWith("--sort=")) {
                parameterSort = arg.replace("--sort=", "").toUpperCase();
            } else if (arg.startsWith("--output-file=")) {
                parameterOutputFile = arg.replace("--output-file=", "");
            }
        }
        try {
            Integer number = (args.length > 0) ? Integer.parseInt(args[0]) : 0;
            IPrimeFactorsCalculator calculator = new PrimeFactorsCalculator();
            IPrimeFactorsFormatter formatter = getFormatter(parameterFormat);
            IPrimeFactorsSorter sorter = getSorter(parameterSort);
            IPrimeFactorsPrinter printer = getPrinter(parameterOutputFile);
            PrimeFactorsProgram primeFactorsProgram = new PrimeFactorsProgram(calculator, sorter, formatter, printer);
            primeFactorsProgram.factorize(number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    protected static IPrimeFactorsPrinter getPrinter(String parameterOutputFile) {
        IPrimeFactorsPrinter printer;
        if (parameterOutputFile != null) {
            printer = new PrimeFactorsPrinterFile(parameterOutputFile, "UTF-8");
        } else {
            printer = new PrimeFactorsPrinterConsole();
        }
        return printer;
    }

    protected static IPrimeFactorsSorter getSorter(String parameterSort) {
        IPrimeFactorsSorter sorter;
        if (parameterSort != null) {
            if (parameterSort.equals("ASC")) {
                sorter = new PrimeFactorsSorterAsc();
            } else if (parameterSort.equals("DESC")) {
                sorter = new PrimeFactorsSorterDesc();
            } else {
                throw new ExceptionInvalidParameterSorter();
            }
        } else {
            sorter = new PrimeFactorsSorterAsc();
        }
        return sorter;
    }

    protected static IPrimeFactorsFormatter getFormatter(String parameterFormat) {
        IPrimeFactorsFormatter formatter;
        if (parameterFormat != null) {
            if (parameterFormat.equals("PRETTY")) {
                formatter = new PrimeFactorsFormatterPretty();
            } else if (parameterFormat.equals("QUIET")) {
                formatter = new PrimeFactorsFormatterQuiet();
            } else {
                throw new ExceptionInvalidParameterFormat();
            }
        } else {
            formatter = new PrimeFactorsFormatterPretty();
        }
        return formatter;
    }

}