import java.util.Scanner;

public class AccountInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();

        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        //interest rate
        for (int i = 0; i < interestRates.length; i++) {
            double rate = interestRates[i];
            double balance = initialBalance;

            System.out.printf("%nWith an initial balance of %.2f at an interest rate of %.2f%n",
                    initialBalance, rate);

            //for each year (1 to 4)
            for (int year = 1; year <= 4; year++) {
                balance += balance * rate; // Calculate new balance
                System.out.printf("After year %d balance is %.4f%n", year, balance);
            }
        }
    }
}
