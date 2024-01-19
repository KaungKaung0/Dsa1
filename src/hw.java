import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the radius :");
     int r = sc.nextInt();
     System.out.println();
    System.out.println("Enter the length");
    int l = sc.nextInt();
    System.out.println("Enter the width");
    int w = sc.nextInt();
    
    areaofrec(l,w);
    areaofcircle(r);
    }
    public static void areaofcircle(int r){
        System.out.println("Area of Circle"+ 3.14*r*r);
    }
    public static void areaofrec(int l, int w){
        System.out.println("Area of Rectangle"+ l*w);
    }
}
