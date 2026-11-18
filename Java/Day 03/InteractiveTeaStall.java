
import java.util.Scanner;

public class InteractiveTeaStall {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to our tea stall!.");
        System.out.println("1. Tea - 10 \n 2. coffee - 20 \n 3. cold coffee - 50 \n 4. Exit");
        System.out.println("Choose by entering a number (1-4):");
        int choice = sc.nextInt();
        if (choice >= 1 && choice <= 4) {
            if (choice == 1) {
                System.out.println("How many cups of refreshing tea?");
                int noOfCups = sc.nextInt();
                System.out.println("Total for " + noOfCups + " cup(s): Rs. " + (noOfCups * 10) + ".");
                System.out.println("Enter your payment amount: Rs.");
                double amount = sc.nextDouble();

                if (amount == (noOfCups * 10)) {
                    System.out.println("Thank you for visiting! We look forward to serving you again soon!");
                } else if (amount <= (noOfCups * 10)) {
                    System.out.println("Pay full amount");
                } else if (amount >= (noOfCups * 10)) {
                    System.out.println("Change: Rs. " + (amount - (noOfCups * 10)) + ".");
                    System.out.println("Thank you for visiting! We look forward to serving you again soon!");

                }

            } else if (choice == 2) {
                System.out.println("How many cups of aromatic coffee?");
                int noOfCups = sc.nextInt();
                System.out.println("Total for " + noOfCups + " cup(s): Rs. " + (noOfCups * 20) + ".");
                System.out.println("Enter your payment amount: Rs.");
                double amount = sc.nextDouble();
                if (amount == (noOfCups * 20)) {
                    System.out.println("Thank you for visiting! We look forward to serving you again soon!");
                } else if (amount <= (noOfCups * 20)) {
                    System.out.println("Pay full amount");
                } else if (amount >= (noOfCups * 20)) {
                    System.out.println("Change: Rs. " + (amount - (noOfCups * 20)) + ".");
                    System.out.println("Thank you for visiting! We look forward to serving you again soon!");

                }

            } else if (choice == 3) {
                System.out.println("How many cups of chilled cold coffee?");
                int noOfCups = sc.nextInt();
                System.out.println("Total for " + noOfCups + " cup(s): Rs. " + (noOfCups * 50) + ".");
                System.out.println("Enter your payment amount: Rs.");
                double amount = sc.nextDouble();

                if (amount == (noOfCups * 50)) {
                    System.out.println("Thank you for visiting! We look forward to serving you again soon!");
                } else if (amount <= (noOfCups * 50)) {
                    System.out.println("Pay full amount");
                } else if (amount >= (noOfCups * 50)) {
                    System.out.println("Change: Rs. " + (amount - (noOfCups * 50)) + ".");
                    System.out.println("Thank you for visiting! We look forward to serving you again soon!");

                }
            } else {
                System.out.println("Thank you for visiting! We look forward to serving you again soon!");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid choice");
        }

    }

}
