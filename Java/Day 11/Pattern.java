import java.util.Scanner;

public class Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of cols");
        int col = sc.nextInt();
        // int mid = row / 2 + 1;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= col; j++) {
                if (i == j || i + j == col + 1) {
                    System.out.printf("%3c", '#');
                } else {
                    System.out.printf("%3c", '0');
                }
            }

            System.out.println();
        }

    }
}
