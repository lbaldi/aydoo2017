package ar.edu.untref.aydoo;

public class Program {

    public static String print(int number, String format) {

        try{

            return PrimeFactorsCalc.print(number, format);

        } catch (Exception e){

            return e.getMessage();

        }

    }

    public static void main(String args[]) {

        int number = (args.length > 0) ? Integer.parseInt(args[0]) : 0;

        String format = null;

        for (int i = 0; i < args.length; i++){

            if (args[i].startsWith("--format=")){

                format = args[i].replace("--format=", "").toUpperCase();

            }

        }

        System.out.println(print(number, format));

    }

}