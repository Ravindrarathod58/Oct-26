import java.util.Scanner;

public class ServiceCenter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the type vehicle in number (2,3,4)");
        int type = sc.nextInt();
        String issue = null;
        double bill = 0;
        if (type == 2 || type == 3 || type == 4) {

            System.out.println("Enter the age of the vehicle");
            int age = sc.nextInt();

            if (age > 8) {

                System.out.println(
                        "1. Enter 1 for Tyre problem \n 2. Enter 2 for Fuel Problem \n 3. Enter 3 for Engine Problem \n 4. Enter 4 for General Service");
                int typeOfProblem = sc.nextInt();
                if (typeOfProblem == 1) {

                    System.out.println("How many tyres are facing issues");
                    int noOftyres = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of the owner");
                    String owner = sc.nextLine();
                    // Buffer issue
                    System.out.println("Name of the vehicle ");
                    String vehicleName = sc.next();
                    issue = "Tyre Problem";
                    /*
                     * 2 wheeler -> tyres -> 2
                     * 3 -> 3
                     * 4 -> 4
                     * 
                     */

                    if (type == 2 && noOftyres <= 2) {

                        bill = noOftyres * 400;

                        System.out.println(
                                "Owner Name :" + owner + "\n Vehicle Name :" + vehicleName + "\n Issue :" + issue
                                        + "\n Bill :" + bill);

                    } else if (type == 3 && noOftyres <= 3) {
                        bill = noOftyres * 400;

                        System.out.println(
                                "Owner Name :" + owner + "\n Vehicle Name :" + vehicleName + "\n Issue :" + issue
                                        + "\n Bill :" + bill);
                    } else if (type == 4 && noOftyres <= 4) {
                        bill = noOftyres * 400;

                        System.out.println(
                                "Owner Name :" + owner + "\n Vehicle Name :" + vehicleName + "\n Issue :" + issue
                                        + "\n Bill :" + bill);
                    } else {
                        System.out.println("Invalid number of tyres");
                    }

                } else if (typeOfProblem == 2) {

                    System.out.println("Enter the name of the owner");
                    String owner = sc.nextLine();

                    System.out.println("Name of the vehicle ");
                    String vehicleName = sc.next();
                    issue = "Fuel Problem";

                    bill = 1500;

                    System.out.println(
                            "Owner Name :" + owner + "\n Vehicle Name :" + vehicleName + "\n Issue :" + issue
                                    + "\n Bill :" + bill);

                } else if (typeOfProblem == 3) {

                    System.out.println("Enter the name of the owner");
                    String owner = sc.nextLine();

                    System.out.println("Name of the vehicle ");
                    String vehicleName = sc.next();
                    issue = "Engine Problem";

                    bill = 5000;

                    System.out.println(
                            "Owner Name :" + owner + "\n Vehicle Name :" + vehicleName + "\n Issue :" + issue
                                    + "\n Bill :" + bill);

                } else if (typeOfProblem == 4) {

                    System.out.println("Enter the name of the owner");
                    String owner = sc.nextLine();

                    System.out.println("Name of the vehicle ");
                    String vehicleName = sc.next();
                    issue = "General Service";

                    bill = 1000;

                    System.out.println(
                            "Owner Name :" + owner + "\n Vehicle Name :" + vehicleName + "\n Issue :" + issue
                                    + "\n Bill :" + bill);

                } else {
                    System.out.println("Invalid service type");
                }

            } else {
                System.out.println("your vehicle service will done after a while");
            }

        } else {
            System.out.println("This service center is only accpting 2 , 3 and 4 wheelers ");
        }
    }
}
