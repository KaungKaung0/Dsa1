package interfaceeg;

import java.util.Scanner;

public class PetDemo {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        char answer;
        do{
            Menu();
            System.out.println("Do You want to try other pets behavior (y/n)");
            answer = sc.next().charAt(0);
        }
        while (answer=='y');
        System.out.println("END Program");
        
    }
    public static void Menu(){
        System.out.println("Please Choose option (1 or 2) \n 1 for checking Cat " + " Behavior \n2 for checking Dog Behavior ");

        int choosenum= sc.nextInt();
        if (choosenum==1) {
            Cat obj = new Cat();
            obj.eat();
            obj.voice();
            obj.play();
            
        }
        else if (choosenum==2){
            PetExample obj = new Dog();
            obj.eat();
            obj.voice();
            obj.play();
        }
    }
}
