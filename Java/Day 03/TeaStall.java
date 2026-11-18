import java.util.Scanner;

public class TeaStall {
    static Scanner sc = new Scanner(System.in); // global declarationss

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); // only main method
        System.out.println("1. Masala Tea - 10 \n 2. Ginger Tea - 15 \n 3. Lemon Tea - 20");
        System.out.println("Enter your choice :");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 3) {
            System.out.println("How many cups : ");
            int noOfCups = sc.nextInt();
            if (choice == 1) {
                System.out.println("Total Bill : " + (10 * noOfCups));
            } else if (choice == 2) {
                System.out.println("Total Bill : " + (15 * noOfCups));
            } else if (choice == 3) {
                System.out.println("Total Bill : " + (20 * noOfCups));
            }
        } else {
            System.out.println("Invalid choice");
        }

    }

    void hello() {
        sc.next();
    }
}
