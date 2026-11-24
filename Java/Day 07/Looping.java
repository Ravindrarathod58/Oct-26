import java.util.Scanner;

class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("Enter a number");
         * int n = sc.nextInt();
         * int temp = n;
         * int sum = 0;
         * 
         * while (temp != 0) {
         * 
         * int last = temp % 10;
         * int fact = 1;
         * while (last != 0) {
         * fact = fact * last;
         * last--;
         * }
         * sum += fact;
         * 
         * temp /= 10;
         * }
         * 
         * if (n == sum) {
         * System.out.println("Strong Number");
         * } else {
         * System.out.println("Not Strong number");
         * }
         * 
         * 
         * System.out.println("Enter a number");
         * int n = sc.nextInt();
         * int temp = n;
         * int square = n * n;
         * 
         * int div = 1;
         * while (temp != 0) {
         * div = div * 10;
         * temp = temp / 10;
         * }
         * 
         * int last = square % div;
         * if (last == n) {
         * System.out.println("Automorphic Number");
         * } else {
         * System.out.println("Not An Automorphic Number");
         * }
         * 
         * 
         * System.out.println("Enter a number");
         * int n = sc.nextInt();
         * 
         * int temp = n, sum = 0, i = 1, rev = 0;
         * // int sum = 0;
         * // int i = 1;
         * // int rev = 0;
         * 
         * while (temp != 0) {
         * rev = rev * 10 + (temp % 10);
         * temp = temp / 10;
         * }
         * 
         * temp = rev;
         * while (temp != 0) {
         * int last = temp % 10;
         * int pow = 1;
         * int j = 1;
         * while (j <= i) {
         * pow = pow * last;
         * j++;
         * }
         * i++;
         * sum += pow;
         * temp = temp / 10;
         * 
         * }
         * 
         * if (sum == n) {
         * System.out.println("Number is Disarium number");
         * } else {
         * System.out.println("Not a disarium number");
         * }
         * 
         * 
         * 
         * System.out.println("Enter a number");
         * int n = sc.nextInt();
         * if (n <= 1) {
         * System.out.println("Not prime or composite");
         * return;
         * }
         * 
         * for (int i = 2; i <= n / 2; i++) {
         * if (n % i == 0) {
         * System.out.println("Not a Prime Number");
         * return;
         * }
         * }
         * System.out.println("Prime  number");
         * 
         */

        System.out.println("Enter n terms");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}