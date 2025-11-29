package edu.pasadena.cs.cs03b;

public class TaxTableTools {

    private int[] salaryBrackets;
    private double[] taxRates;

    public void setTable(int[] salaryBrackets, double[] taxRates) {
        this.salaryBrackets = salaryBrackets;
        this.taxRates = taxRates;
    }




    public double getRate(double income) {

        for (int i = 0; i < salaryBrackets.length - 1; i++) {

            int min = salaryBrackets[i];
            int max = salaryBrackets[i + 1];

            if (income >= min && income < max) {
                return taxRates[i];
            }
        }

        return taxRates[taxRates.length - 1];
    }
}
