package mortgagecalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args){

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double mortgage;
        int principle;
        float annualInterest;
        float monthlyInterest;
        int numberOfPayments;
    // Creating an instance for a scanner
        Scanner scanner = new Scanner(System.in);

    // Getting inputs from user
        while (true) {
            System.out.print("Principle ($1K - $1M):");
            principle = scanner.nextInt();
            if(principle>=1000 && principle<=1_000_000)
                break;
            System.out.println("Enter value between 1000 and 1000000");
        }


        while (true) {
            System.out.print("Annual Interest Rate:");
            annualInterest = scanner.nextFloat();
            if(annualInterest>=1 && annualInterest<=30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (years):");
            byte period = scanner.nextByte();
            if(period>=1 && period<=30) {
                numberOfPayments = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


    // Output Generation
        mortgage = principle*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments)
         /(Math.pow(1+monthlyInterest,numberOfPayments)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: "+mortgageFormatted);

        scanner.close();

    }
}
