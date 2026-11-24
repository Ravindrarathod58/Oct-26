
import java.util.Scanner;

public class Loping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * int sum = 0;
         * int i = 1;
         * while (i <= n) {
         * sum += i;
         * i++;
         * }
         * 
         * System.out.println("Sum of n natural number is : " + sum);
         */

        // 1234 => 4 3 2 1

        //
        /*
         * System.out.println("Enter the number");
         * int n = sc.nextInt();
         * 
         * // 1234 % 10 ; 4 , 1234 / 10 = 123
         * while (n != 0) { // 1234 != 0 T , 123 != 0
         * System.out.println(n % 10); // 1234 % 10 = 4, 123 % 10 = 3
         * n /= 10;// 1234 / 10 = 123 , 123 / 10 =
         * }
         * 
         * 
         * 
         * System.out.println("Enter the number");
         * int n = sc.nextInt(); // 1234
         * int rev = 0;// 0 4 43 4321
         * while (n != 0) { // 1234 != 0 T , 123 != 0 T, 12 != 0 T, 1 != 0, 0 != 0 F
         * int last = n % 10; // 1234 % 10 = 4, 123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
         * rev = rev * 10 + last; // 0 * 10 + 4; 0 * 10 = 0 + 4 = 4
         * // 4 * 10 + 3 = 40 + 3 = 43, 43 * 10 + 2 = 430 + 2 = 432
         * // 432 * 10 + 1 = 4320 + 1 = 4321
         * n /= 10; // 1234 / 10 = 123, 123 / 10 = 12, 12 / 10 = 1, 1 / 10 0
         * }
         * 
         * System.out.println(rev);
         * 
         * 
         * System.out.println("Enter a number");
         * int n = sc.nextInt(); // 5
         * int fact = 1;// 120
         * while (n >= 1) { // 5 >= 1 T, 4 >= 1. 3 >= 1, 2 >= 1, 1 >= 1, 0 >= 0 F
         * fact *= n;// 1 * 5 = 5, 5 * 4 = 20, 20 * 3 = 60, 60 * 2 = 120, 120 * 1 = 120
         * n--; // 4 3 2 1 0
         * }
         * System.out.println(fact);
         * 
         * 
         * 
         * char ch = 'A'; // 65
         * while (ch <= 'Z') { // 65 <= 96
         * System.out.println(ch + " : " + (int) ch);
         * ch++;
         * }
         * 
         * // System.out.println((int) '0');
         * 
         */

        // int n1 = 10;
        // int n2 = 1;
        // while (n2 <= n1) {
        // System.out.println(n2++);
        // }

        int n = 1256;
        int rev = n;
        // int temp = n;
        // while (temp != 0) {
        // rev = rev * 10 + temp % 10;
        // temp = temp / 10;
        // }

        // 1256

        String word = ""; // six

        while (rev != 0) { // 6521 652 65
            int last = rev % 10; // 1 2 5 6
            switch (last) {
                case 0:
                    word = "zero " + word;
                    break;
                case 1:
                    word = "one " + word; // one + two five six = one two five six
                    break;
                case 2:
                    word = "two " + word; // two + five six = two five six
                    break;
                case 3:
                    word = "three " + word;
                    break;
                case 4:
                    word = "four " + word;
                    break;
                case 5:
                    word = "five " + word;// five + six = five six
                    break;
                case 6:
                    word = "six " + word;
                    break;
                case 7:
                    word = "seven " + word;
                    break;
                case 8:
                    word = "eight " + word;
                    break;
                case 9:
                    word = "nine " + word;

                    break;

            }
            rev /= 10;
        }

        System.out.println(word);
    }

}
