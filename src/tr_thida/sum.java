package tr_thida;

import java.util.Scanner;

public class sum {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 =");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 =");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3 =");
        int num3 = sc.nextInt();

        int result = sum (num1,num2,num3);
        System.out.println("Sum of two numbers" + result);

        result = sum1 (num1,num2);
        System.out.println("Sum of three numbers" + result);

    }

    private static int sum(int num1, int num2, int num3) {
         return(num1+num2+num3);
    }

    private static int sum1(int num1, int num2) {
       
        return (num1+num2);
    }

    
}
