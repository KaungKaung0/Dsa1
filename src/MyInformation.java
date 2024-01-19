import java.util.Scanner;

public class MyInformation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Your Name:");
        String name = sc.nextLine();
        System.out.print("Your Age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Your Address:");
        String address = sc.nextLine();
        System.out.print("Your Weight:");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("Your Phone Number:");
        String pn = sc.nextLine();
        System.out.println( "My Information \n=============");
        System.out.println("Your Name      :" +name);
        System.out.println("Your Age       :" +age);
        System.out.println("Your Address   :" + address);
        System.out.println("Your Weight    :" + weight);
        System.out.print("Your PhoneNumber:" + pn);







    }
}
