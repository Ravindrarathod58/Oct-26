
import java.util.Scanner;

class SimpleIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        // int num = sc.nextInt();

        // simple if
        // 10 % 2 = 0 == 0 -> True
        // the number is even
        // 11 % 2 = 1 == 0 -> false

        // if (num % 2 == 0) {
        // System.out.println("The number is even");
        // }
        // if (num % 2 == 0)
        // System.out.println("The number is even");
        // System.out.println("After if");

        // if (num % 2 == 1) {
        // System.out.println("The number is odd");
        // }

        // if (num % 2 != 0) {
        // System.out.println("The number is odd");
        // }
        // if (!(num % 2 == 0)) {
        // System.out.println("The number is odd");
        // }

        // Basic logical programs

        // if - else

        // if (num % 2 == 0)
        // System.out.println("Even Number");
        // else
        // System.out.println("Odd Number");

        // if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
        // System.out.println("Leap Year");
        // } else {
        // System.out.println("Not leap");
        // }
        // hello
        // 01234 charAt(1) // e
        // char c = sc.next().charAt(0);// string collection of character charAt returns
        // the character at 0 index
        // if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
        // System.out.println("character is alphabet");

        // } else {
        // System.out.println("Character is not a alphabet");
        // }

        // 65 + 32 = 97
        // B - b = 32char
        // if (c >= 'A' && c <= 'Z') {
        // c += 32;
        // }

        // if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        // System.out.println("Vowel");
        // } else {
        // System.out.println("Consonant");
        // }

        // if (c >= 'a' && c <= 'z') {
        // System.out.println("Alphabet");
        // } else {
        // if (c >= '0' && c <= '9') {
        // System.out.println("Digit");
        // } else {
        // System.out.println("Special character");
        // }
        // }
        // 15 15 % 10 = 5
        int n = sc.nextInt();
        if (n % 10 >= 5) {
            System.out.println((n / 10 + 1) * 10);
            // 15 / 10 = 1 + 1 = 2 * 10 = 20
        } else {
            System.out.println((n / 10) * 10);
        }
    }
}