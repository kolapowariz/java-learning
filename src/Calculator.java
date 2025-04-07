import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {

        public static void  main (String [] args) {
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;

            Scanner scannerCalculator = new Scanner(System.in);
            int principal = 0;

            while (principal < 1000 || principal > 1_000_000) {
                System.out.print("Principal ($1k - $1M): ");
                principal = scannerCalculator.nextInt();
                if (principal < 1000 || principal > 1_000_000){
                    System.out.println("Enter a number between 1,000 and 1,000,000.");
                }
            }

            double annualInterestRate = 0;
            while (annualInterestRate <= 0 || annualInterestRate > 30) {
                System.out.print("Annual Interest Rate: ");
                annualInterestRate = scannerCalculator.nextDouble();
                if (annualInterestRate <= 0 || annualInterestRate > 30) {
                    System.out.println("Enter a value greater than 0 and less than or equal to 30");
                }
            }

            double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
            double monthlyInterestRatePercentage = monthlyInterestRate / PERCENT;

            int period = 0;
            while (period <= 0 || period > 30) {
                System.out.print("Period (Years): ");
                period = scannerCalculator.nextInt();
                if (period <= 0 || period > 30) {
                    System.out.println("Enter a value between 1 and 30.");
                }

            }

            int periodInMonths = period * MONTHS_IN_YEAR;

            double numerator = monthlyInterestRatePercentage * Math.pow((1 + monthlyInterestRatePercentage), periodInMonths);
            double denominator = Math.pow((1 + monthlyInterestRatePercentage), periodInMonths) - 1;

            double mortgage = principal * numerator / denominator;
            String currencyMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + currencyMortgage);

        }
}


