import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

        public static void main (String [] args) {
            int principal = (int)readNumber("Principal: ", 1000, 1_000_000);
            double annualInterestRate = readNumber("Annual Interest Rate: ", 1, 30);
            byte period = (byte) readNumber("Period (Years): ", 1, 30);

            printMortgage(principal, annualInterestRate, period);
            printPaymentSchedule(period, principal, annualInterestRate);
        }

    private static void printMortgage(int principal, double annualInterestRate, byte period) {
        double mortgage = calculateMortgage(principal, annualInterestRate, period);
        String currencyMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + currencyMortgage);
    }

    private static void printPaymentSchedule(byte period, int principal, double annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= period * MONTHS_IN_YEAR; month++) {
            double paymentSchedule = calculatePaymentSchedule(principal, annualInterestRate, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(paymentSchedule));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
            Scanner scannerCalculator = new Scanner(System.in);
            double value;

            while (true) {
                System.out.print(prompt);
                value = scannerCalculator.nextFloat();
                if (value >= min && value <= max)
                    break;
                System.out.println("Enter a value between " + min + " and " + max);
            }
            return value;
        }

        public static double calculateMortgage
                (int principal, double annualInterestRate, int period) {
            int periodInMonths = period * MONTHS_IN_YEAR;
            double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
            double monthlyInterestRatePercentage = monthlyInterestRate / PERCENT;

            double numerator = monthlyInterestRatePercentage * Math.pow((1 + monthlyInterestRatePercentage), periodInMonths);
            double denominator = Math.pow((1 + monthlyInterestRatePercentage), periodInMonths) - 1;

            return principal * numerator / denominator;
        }

        public static double calculatePaymentSchedule
                (int principal, double annualInterestRate, int period, short numberOfPaymentMade) {

            int periodInMonths = period * MONTHS_IN_YEAR;
            double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
            double monthlyInterestRatePercentage = monthlyInterestRate / PERCENT;

            double numerator = (Math.pow((1 + monthlyInterestRatePercentage), periodInMonths) - Math.pow((1 + monthlyInterestRatePercentage), numberOfPaymentMade));
            double denominator = (Math.pow((1 + monthlyInterestRatePercentage), periodInMonths)) - 1;

            return principal * numerator / denominator;
        }
}


