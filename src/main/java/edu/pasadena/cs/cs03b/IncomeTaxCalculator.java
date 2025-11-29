package edu.pasadena.cs.cs03b;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] brackets = {0, 20000, 50000, 100000, Integer.MAX_VALUE};
        double[] rates = {0.0, 0.10, 0.20, 0.30, 0.40};

        TaxTableTools t = new TaxTableTools();
        t.setTable(brackets, rates);

        while (true) {

            System.out.println("Enter annual income (-1 to exit):");
            int income = input.nextInt();

            if (income == -1) {
                break;
            }

            if (income < 0) {
                System.out.println("Invalid income.");
                continue;
            }

            double r = t.getRate(income);
            double tax = income * r;




            System.out.println("Annual Income: " + income);
            System.out.println("Tax rate: " + r);
            System.out.println("Tax to pay: " + tax);
            System.out.println();
        }

        input.close();
    }
}

