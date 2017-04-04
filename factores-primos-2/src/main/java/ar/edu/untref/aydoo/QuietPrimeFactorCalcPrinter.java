package ar.edu.untref.aydoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class QuietPrimeFactorCalcPrinter implements IPrimeFactorCalcPrinter{

    @Override
    public String print(int number, ArrayList<Integer> factors){

        String result = "";

        Collections.reverse(factors);

        for(Integer factor: factors){

            result += factor.toString() + System.lineSeparator();

        }

        return result;

    };

}
