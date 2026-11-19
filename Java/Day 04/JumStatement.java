import java.util.Scanner;

class JumpStatement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * System.out.println("Majors and Tuition Fees:");
         * System.out.println("1. Science \n 2. Arts \n 3. Commerce");
         * System.out.println("Select Major");
         * int major = sc.nextInt();
         * 
         * switch (major) {
         * case 1: {
         * System.out.println("1. Physics \n 2. chemistry \n 3. Bio");
         * System.out.println("Choose the subject");
         * int choice = sc.nextInt();
         * switch (choice) {
         * case 1:
         * System.out.println("You have selected: Science -> Physics");
         * System.out.println("\tYour course fee is: $" + 500);
         * break;
         * case 2:
         * System.out.println("You have selected: Science -> Chemistry");
         * System.out.println("\tYour course fee is: $" + 450);
         * break;
         * case 3:
         * System.out.println("You have selected: Science -> bio");
         * System.out.println("\tYour course fee is: $" + 400);
         * break;
         * default:
         * System.out.println("Invalid subject");
         * }
         * break;
         * }
         * case 2: {
         * System.out.println("1. Literature \n 2. History \n 3. Psychology");
         * System.out.println("Choose the subject");
         * int choice = sc.nextInt();
         * switch (choice) {
         * case 1:
         * System.out.println("You have selected: Arts -> Literature");
         * System.out.println("\tYour course fee is: $" + 300);
         * break;
         * case 2:
         * System.out.println("You have selected: Arts -> History");
         * System.out.println("\tYour course fee is: $" + 350);
         * break;
         * case 3:
         * System.out.println("You have selected: Arts -> Psychology");
         * System.out.println("\tYour course fee is: $" + 400);
         * break;
         * default:
         * System.out.println("Invalid subject");
         * }
         * break;
         * }
         * case 3: {
         * System.out.println("1. Economics \n 2. Accounting \n 3. Business Studies");
         * System.out.println("Choose the subject");
         * int choice = sc.nextInt();
         * switch (choice) {
         * case 1:
         * System.out.println("You have selected: Commerce -> Economics");
         * System.out.println("\tYour course fee is: $" + 350);
         * break;
         * case 2:
         * System.out.println("You have selected: Commerce -> Accounting");
         * System.out.println("\tYour course fee is: $" + 400);
         * break;
         * case 3:
         * System.out.println("You have selected: Commerce -> Business Studies");
         * System.out.println("\tYour course fee is: $" + 450);
         * break;
         * default:
         * System.out.println("Invalid subject");
         * }
         * break;
         * }
         * 
         * default:
         * System.out.println("Invalid choice");
         * 
         * }
         * 
         * 
         */

        /*
         * System.out.println("Enter you id:");
         * int id = sc.nextInt();
         * switch (id) {
         * case 1001:
         * System.out.println("Enter your password");
         * int pass = sc.nextInt();
         * switch (pass) {
         * case 1010:
         * System.out.println("Welcome User");
         * break;
         * default:
         * System.out.println("Invalid pasword");
         * }
         * break;
         * default:
         * System.out.println("Invalid Id");
         * }
         */

        /*
         * System.out.println("Enter the month number (1-12)");
         * int month = sc.nextInt(); // 30 31 28 29
         * switch (month) {
         * 
         * case 4:
         * case 6:
         * case 9:
         * case 11:
         * System.out.println("The month has 30 days");
         * break;
         * case 1:
         * case 3:
         * case 5:
         * case 7:
         * case 8:
         * case 10:
         * case 12:
         * System.out.println("The month has 31 days");
         * break;
         * case 2:
         * System.out.println("Enter year");
         * int year = sc.nextInt();
         * int isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 1 : 0;
         * switch (isLeap) {
         * case 1:
         * System.out.println("The month has 29 days");
         * break;
         * 
         * default:
         * System.out.println("The month has 28 days");
         * break;
         * }
         * break;
         * 
         * default:
         * System.out.println("Invalid month");
         * }
         * 
         */

        /*
         * 
         * System.out.println("Enter the initial aamount for account");
         * int balance = sc.nextInt();
         * switch (balance) {
         * case 0:
         * System.out.println("0 Not allowed");
         * break;
         * default:
         * if (balance < 0) {
         * System.out.println("negative not allowed");
         * System.exit(0);
         * } else if (balance <= 2000) {
         * System.out.println("Minimum balance must be 2000");
         * System.exit(0);
         * }
         * }
         * 
         * System.out.println("Enter you choice");
         * System.out.println("1. d for Deposite \n 2. w for withdrawl");
         * char ch = sc.next().charAt(0);
         * switch (ch) {
         * case 'd':
         * case 'D': {
         * System.out.println("Enter amount to deposite");
         * int amount = sc.nextInt();
         * if (amount == 0) {
         * System.out.println("0 not allowed");
         * } else if (amount < 0) {
         * System.out.println("Negative not allowed");
         * } else {
         * balance += amount;
         * }
         * 
         * System.out.println("Your balance is : " + balance);
         * }
         * break;
         * 
         * case 'w':
         * case 'W': {
         * System.out.println("Enter the amount to withdraw");
         * int amount = sc.nextInt();
         * 
         * // 2001 - 2000 -> 1
         * 
         * if (amount == 0) {
         * System.out.println("0 not allowed");
         * } else if (amount < 0) {
         * System.out.println("Negative not allowed");
         * } else if (balance - amount >= 2000) {
         * balance -= amount;
         * } else {
         * System.out.println("Insufficient funds");
         * }
         * System.out.println("Your remaining balance is " + balance);
         * 
         * }
         * break;
         * default:
         * System.out.println("Invalid transaction");
         * 
         * }
         */

        /* + - / * -> based operator */

        System.out.println("Enter operator (+ , -, *, /)");
        char op = sc.next().charAt(0);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int result = switch (op) {
            case '+' -> num1 + num2; // considered as return statement
            case '-' -> num1 - num2;

            // case 1,2,3,4 -> {yield 0} sequential cases
            default -> {
                System.out.println("invalid operation");
                yield 0;
            }
        };

        //
    }
}