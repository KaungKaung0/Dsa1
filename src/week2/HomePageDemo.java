package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomePageDemo {
    static Scanner sc = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        char ans;
        do {
            homeMenu();
            System.out.println("Wanna Try Again. Please Type (y/n)");
            ans = sc.next().charAt(0);
        } while (ans == 'y');
    }

    public static void homeMenu() {
        System.out.println("Please choose option (1 or 2) \n1 for insert Student data \n2 for view studentlist");
        int choosenum = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by previous nextInt()

        if (choosenum == 1) {
            // Insert student data logic
            System.out.println("Insert data  \n===========");
            System.out.print("Enter student name: ");
            String stu_name = sc.nextLine();
            System.out.print("Enter student address: ");
            String stu_address = sc.nextLine();
            System.out.print("Enter student phone number: ");
            String stu_phno = sc.nextLine();
            System.out.print("Enter student batchno: ");
            String stu_bno = sc.nextLine();
            System.out.print("Enter student age: ");
            int stu_age = sc.nextInt();

            // Create a new Student object and add it to the list
            Student newStudent = new Student(stu_name, stu_address, stu_phno, stu_bno, stu_age);
            studentList.add(newStudent);

            System.out.println("Student data added successfully.");
        } else if (choosenum == 2) {
            // View student data logic
            System.out.println("View data");
            if (studentList.isEmpty()) {
                System.out.println("No student data available.");
            } else {
                // Iterate over the list and print the details of each student
                for (Student student : studentList) {
                    System.out.println("Name: " + student.getName());
                    System.out.println("Address: " + student.getAddress());
                    System.out.println("Phone Number: " + student.getPhoneNumber());
                    System.out.println("Batch Number: " + student.getBatchNumber());
                    System.out.println("Age: " + student.getAge());
                    System.out.println("------------");
                }
            }
        } else {
            System.out.println("Invalid choice. Please choose either 1 or 2.");
        }
    }

    static class Student {
        private String name;
        private String address;
        private String phoneNumber;
        private String batchNumber;
        private int age;

        public Student(String name, String address, String phoneNumber, String batchNumber, int age) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.batchNumber = batchNumber;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getBatchNumber() {
            return batchNumber;
        }

        public int getAge() {
            return age;
        }
    }
}
