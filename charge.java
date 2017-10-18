
import java.util.Scanner;

public class charge {
    public static void main(String[] args) {
        double previousBalance;
        double charges;
        double interest;
        double currentBalance;
        double minimumPayment;
        double newBalance;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current balance");
        previousBalance = scan.nextDouble();
        System.out.print("Enter the charges");
        charges = scan.nextDouble();
        currentBalance = charges + previousBalance;
        interest = currentBalance*.02;
        newBalance = currentBalance + interest;
        System.out.println("Your current Balance is " + newBalance);
        minimumPayment = currentBalance + (.2*currentBalance);
        System.out.println("CS Card International Statement");
        System.out.println("================================");
        System.out.println("Previous Balance: " + previousBalance);
        System.out.println("Additional Charges: " + charges);
        System.out.println("Interest: " + interest);
        System.out.println("New Balance: " + newBalance);
        System.out.println("Minimum Payment: " + minimumPayment);
    }
}