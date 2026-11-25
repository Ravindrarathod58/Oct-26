import java.util.Scanner;

class Looping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int n = sc.nextInt();
        /*
         * double sum = 1.0;
         * System.out.print("1 ");
         * for (int i = 1; i <= n; i++) {
         * sum = sum + 1.0 / i;
         * System.out.print("+ 1/" + i);
         * }
         * System.out.println("\n sum = " + sum);
         */

        // for (int i = 1; i <= n; i++) {
        // System.out.print(i + " ");
        // if (i % 3 == 0) {
        // System.out.print(i * 3 + " ");
        // }
        // }

        // int result = 0;
        // for (int i = 1; i <= n; i++) {

        // if (i % 2 == 0) {
        // result -= i;
        // System.out.print(" - " + i);
        // } else {
        // result += i;
        // if (i == 1) {
        // System.out.print(i + " ");
        // } else {
        // System.out.print(" + " + i);
        // }
        // }
        // }
        // System.out.println(" = " + result);

        // System.out.println(Integer.toBinaryString(25));
        // 2
        int start = 0;
        int end = 1; // 1 * 10 = 10 * 10 = 100
        while (n != 0) {
            end = end * 10;
            n--;
        }
        start = end / 10; // 100 / 10 = 10

        for (int i = start; i <= end; i++) {

            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}