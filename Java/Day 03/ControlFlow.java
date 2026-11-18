
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price");
        double costPrice = sc.nextDouble();
        System.out.println("Enter the selling price");
        double sellingPrice = sc.nextDouble();

        double VAT = (sellingPrice * 0.05); // (selling * 5 / 100)
        double tax = (sellingPrice * 0.10);
        System.out.println(VAT);
        System.out.println(tax);
        double netSellingPrice = sellingPrice - VAT - tax;

        if (netSellingPrice > costPrice) {
            System.out.println("Rajesh Made a profit" + (netSellingPrice - costPrice));
        } else {
            System.out.println("Rajesh made a loss");
        }

    }
}
