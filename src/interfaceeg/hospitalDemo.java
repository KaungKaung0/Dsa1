package interfaceeg;

import java.util.Scanner;

public class hospitalDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      char answer;
    do{
        Menu();
        System.out.println("Do You want to check Hospital Menu (y/n)");
        answer = sc.next().charAt(0);
    }
    while (answer=='y');
    System.out.println("END Program");
}
    public static void Menu(){
        System.out.println("Please Choose option (1 or 2) \n 1 for checking Doctor List " + " \n 2 for checking Patient Info ");

        int choosenum= sc.nextInt();  
        if (choosenum==1) {
            Doctor obj = new Doctor();
            obj.Information();
            obj.AppointMent();
            obj.TreatMent();
            
        }
        else if (choosenum==2){
            Patient obj = new Patient();
            obj.Information();
            obj.AppointMent();
            obj.TreatMent();
        }
}
}
