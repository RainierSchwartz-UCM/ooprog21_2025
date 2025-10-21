import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance;
        double interestRate = 0.03;
        int choice;
        int year = 1;
        
        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();
        
        while (true) {
            System.out.println("\nDo you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            
            if (choice != 1) {
                break;
            }
            
            balance = balance + (balance * interestRate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", 
                               year, interestRate, balance);
            year++;
        }
        
        input.close();
    }
}