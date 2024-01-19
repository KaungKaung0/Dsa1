import java.util.Scanner;

public class CalculatorDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :");
        int n1 = sc.nextInt();
        System.out.print("Enter num2 :");
        int n2 = sc.nextInt();
        System.out.print("Enter num3 :");
        int n3  = sc.nextInt();
        Calculator calobj= new Calculator(n1,n2,n3);
        calobj.addTwoNumber();
        calobj.addThreeNumber();
    }
}
