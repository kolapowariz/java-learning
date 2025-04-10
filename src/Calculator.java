import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {

        public static void  main (String [] args) {
            int principal = (int)readNumber("Principal: ", 1000, 1_000_000);
            double annualInterestRate = readNumber("Annual Interest Rate: ", 1, 30);
            byte period = (byte) readNumber("Period (Years): ", 1, 30);

            double mortgage = calculateMortgage(principal, annualInterestRate, period);

            String currencyMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + currencyMortgage);
        }

        public static double readNumber(String prompt, double min, double max) {
            Scanner scannerCalculator = new Scanner(System.in);
            double value;

            while (true) {
                System.out.print(prompt);
                value = scannerCalculator.nextFloat();
                if (value >= min || value <= max)
                    break;
                System.out.println("Enter a value between " + min + " and " + max);
            }
            return value;
        }

        public static double calculateMortgage
                (int principal, double annualInterestRate, int period) {
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;
            int periodInMonths = period * MONTHS_IN_YEAR;
            double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
            double monthlyInterestRatePercentage = monthlyInterestRate / PERCENT;

            double numerator = monthlyInterestRatePercentage * Math.pow((1 + monthlyInterestRatePercentage), periodInMonths);
            double denominator = Math.pow((1 + monthlyInterestRatePercentage), periodInMonths) - 1;

            return principal * numerator / denominator;
        }
}


