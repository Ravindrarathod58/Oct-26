import java.util.Scanner;

class ControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("Enter Side 1");
         * int side1 = sc.nextInt();
         * System.out.println("Enter Side 2");
         * int side2 = sc.nextInt();
         * System.out.println("Enter Side 3");
         * int side3 = sc.nextInt();
         * 
         */
        /*
         * side1 = 3
         * side2 = 3
         * side3 = 3
         * 
         * 
         */
        /*
         * if (!(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 >
         * side2)) {
         * System.out.println("tringle is invalid");
         * } else if (side1 == side2 && side2 == side3) {
         * System.out.println("Equilateral tringle");
         * } else if (side1 == side2 || side2 == side3) {
         * System.out.println("Isoleces tringle");
         * } else if (side1 != side2 && side2 != side3) {
         * System.out.println("scalene tringle");
         * } else {
         * System.out.println("Invalid tringle");
         * }
         */
        // side1 == side2 && side2 == side3 equi // side1 == side2
        // side1 == side2 || side2 == side3 iso // side1 == side2
        // side1 != side2 && side2 != side3 scal
        /*
         * System.out.println("Enter the marks for physics");
         * int phy = sc.nextInt();
         * System.out.println("Enter the marks for Chemistry");
         * int che = sc.nextInt();
         * System.out.println("Enter the marks for bio");
         * int bio = sc.nextInt();
         * System.out.println("Enter the marks for maths");
         * int maths = sc.nextInt();
         * System.out.println("Enter the marks for computer");
         * int comp = sc.nextInt();
         * 
         * 
         * int perc = ((phy + che + bio + maths + comp) / 5);
         * // System.out.println(perc);
         * 
         * char grade = ' ';
         * if (perc >= 90) {
         * grade = 'A';
         * } else if (perc >= 80) {
         * grade = 'B';
         * } else if (perc >= 70) {
         * grade = 'C';
         * } else if (perc >= 60) {
         * grade = 'D';
         * } else if (perc >= 40) {
         * grade = 'E';
         * } else {
         * grade = 'F';
         * }
         * System.out.println("The grade is " + grade);
         */

        /*
         * System.out.println("Enter the number of units");
         * int units = sc.nextInt();
         * double bill = 0;
         * if (units <= 50) {
         * bill = units * 0.5;
         * } else if (units <= 150) { // 65
         * bill = (50 * 0.5) + ((units - 50) * 0.75);
         * } else if (units <= 250) { // 170
         * bill = (50 * 0.5) + (100 * 0.75) + ((units - 150) * 1.20);
         * } else if (units > 250) {// 260
         * bill = (50 * 0.5) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
         * 
         * }
         * // 100 * 0.20
         * bill += bill * 0.20;
         * System.out.println(bill);
         * 
         */
    }
}