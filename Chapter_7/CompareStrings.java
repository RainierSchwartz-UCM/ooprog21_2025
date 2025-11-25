import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String inputUser = sc.nextLine();

        String setString = "Carmen";

        if (inputUser.equals(setString)) {
            System.out.println("Carmen equals " + inputUser); } 
            
            else {
            System.out.println("Carmen does not equal to " + inputUser); {
            }
        }
        sc.close();
    }
}