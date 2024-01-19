import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter  Number 2:");
        int num2 = sc.nextInt();
        sum(num1,num2);
        sum(15,25);
        sum(100,90);
    }
    public static void sum(int num1, int num2) {
        int result =num1+num2;
        System.out.println("Sum of the numbers is:"+result);
    }
}
