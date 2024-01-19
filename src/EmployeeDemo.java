import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Employee Name");
       String name = sc.nextLine();
       System.out.println("Enter Employee Address");
       String address = sc.nextLine();
       
       System.out.println("Enter Employee Phone number :");
       String phnum = sc.nextLine();
       System.out.println("Enter Employee Age");
       int age = sc.nextInt();

       Employee empobj = new Employee(name, address, phnum, age);
       
       

}
}