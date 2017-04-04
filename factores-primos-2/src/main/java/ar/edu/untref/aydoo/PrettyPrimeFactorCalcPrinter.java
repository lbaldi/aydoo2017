package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class PrettyPrimeFactorCalcPrinter implements IPrimeFactorCalcPrinter{

    @Override
    public String print(int number, ArrayList<Integer> factors){

        String result = "Factores primos " + Integer.toString(number) + ":";

        for(Integer factor: factors){
            result += " " + factor.toString();
        }

        return result;

    };

}
