import java.util.Scanner;

public class Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        int k = 1;
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {
                if (i % 2 != 0) {
                    System.out.printf("%3d", k++);
                } else {
                    System.out.printf("%3d", --k);
                    // k--;
                }
            }
            k += 5;
            System.out.println();
        }

    }

}
