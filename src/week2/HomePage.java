package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class HomePage {
    static Scanner sc = new Scanner(System.in);
    String stu_name;
    String stu_address;
    String stu_phno;
    String stu_batchno;
    int stu_age;

    static ArrayList<HomePage> studentList = new ArrayList<>();

    public static void main(String[] args) {
        char ans;
        do {
            homeMenu();
            System.out.println("Wanna Try Again. Please Type (y/n)");
            ans = sc.next().charAt(0);
        } while (ans == 'y');
    }

    public static void homeMenu() {

        System.out.println("Please choose option(1 or 2) \n1 for insert Student data \n 2 for view studentlist");
        int choosenum = sc.nextInt();
        if (choosenum == 1) {
            System.out.println("insert data  \n =========");

            System.out.print("Enter student name :");
            String name = sc.next();
            sc.nextLine(); 
            System.out.print("Enter student address: ");
            String address = sc.nextLine();

            System.out.print("Enter student phone number: ");
            String phno = sc.nextLine();
            System.out.print("Enter student batchno: ");
            String bno = sc.nextLine();
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            HomePage newStudent = new HomePage(name, address, phno, bno, age);
            studentList.add(newStudent);

        } else if (choosenum == 2)

            for (HomePage student : studentList) {
                System.out.println("View data \n ====");
                System.out.println("Name: " + student.getName());
                System.out.println("Address: " + student.getAddress());
                System.out.println("Phone Number: " + student.getPhoneNumber());
                System.out.println("Batch Number: " + student.getBatchNumber());
                System.out.println("Age: " + student.getAge());
                System.out.println("------------");
            }

    }

    public HomePage(String name, String address, String phoneNumber, String batchNumber, int age) {
        this.stu_name = name;
        this.stu_address = address;
        this.stu_phno = phoneNumber;
        this.stu_batchno = batchNumber;
        this.stu_age = age;
    }

    public String getName() {
        return stu_name;
    }

    public String getAddress() {
        return stu_address;
    }

    public String getPhoneNumber() {
        return stu_phno;
    }

    public String getBatchNumber() {
        return stu_batchno;
    }

    public int getAge() {
        return stu_age;
    }
}
