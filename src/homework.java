import java.util.Scanner;

public class homework {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius");
        int r = sc.nextInt();
        double area = Math.PI *r*r ;
        System.out.println("The area of circle is =" +area);



    }
}
