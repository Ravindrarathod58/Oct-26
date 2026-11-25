import java.util.Scanner;

public class Looping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * 
         * 
         * 
         * 
         * System.out.println("Enter a number");
         * int n = sc.nextInt(); // 6 ( 1 = n // 1000 )
         * for (int j = 1; j <= n; j++) {
         * int sum = 0;// 1 3 6
         * for (int i = 1; i <= j / 2; i++) {
         * // 1 2 3 4 5 6 F
         * if (j % i == 0) { // 6 % 1 == 0. 6 % 2 == 0, 6 % 3 == 0, 6 % 4 == 0 F, 6 % 5
         * == 0 F
         * sum += i; // 1 3 6
         * }
         * }
         * if (sum == j) { // 6 == 6
         * System.out.println(sum + " ");
         * }
         * // else {
         * // System.out.println("Not A perfect Number");
         * // }
         * }
         * 
         */

        System.out.println("Eneter a number");
        int n = sc.nextInt();
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;

            }
            n = sum;
        }

        if (n == 4) {
            System.out.println("Not a Happy number");
        } else {
            System.out.println("Happy number");
        }

    }

}
