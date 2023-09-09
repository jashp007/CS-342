import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class SavingsFormulas {

    // Calculate the future value of a lump sum investment
    public static double futureValueLumpSum(double cash, double interest, int years){
        return cash * Math.pow(1 + interest, years);
    }

    // Calculate the future value of a series of constant savings deposits
    public static double compoundSavingsConstant(double cash, double interest, double years) {
        // Formula: FV = Pmt * [((1 + r)^n - 1) / r]

        double futureValue = cash * (((Math.pow(1 + interest, years) - 1) / interest));
        return futureValue;
    }

    // Calculate the future value of a series of variable savings deposits
    public static double compoundSavingsVariable(double values[], double interest) {
        double savingsValue = 0.0;

        int i = 0;
        while (i < values.length) {
            savingsValue += values[i] * Math.pow(1 + interest, values.length - i - 1);
            i++;
        }

        return savingsValue;
    }

    // Calculate the future value of a lump sum with variable interest rates
    public static double futureValueLS_VariableInterest(double cash, double values[]) {
        for (double value : values) {
            cash = cash * (1 + value);
        }

        return cash;
    }
}


