package ar.edu.untref.aydoo;

public class Program {

    public static void main(String arg[]) {
        int number = ((arg.length > 0) ? Integer.parseInt(arg[0]) : 0);
        PrimeFactorsCalc calc = new PrimeFactorsCalc();
        System.out.println(calc.factorize(number));
    }

}