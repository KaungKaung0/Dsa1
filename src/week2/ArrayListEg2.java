package week2;
import java.util.ArrayList;

public class ArrayListEg2 {
    
    public static void main(String[] args) {
        ArrayList<Integer>price = new ArrayList<>();
        ArrayList<String>userlist = new ArrayList<>();

        userlist.add("Horror");
        userlist.add("Comedy");
        userlist.add("Health");
        userlist.add("Information Technology");


        price.add (5000);
        price.add (6000);
        price.add (7000);
        price.add (10000);



        for (int i=0;i<userlist.size();i++)
        {
            System.out.print("Book name is " + userlist.get(i));
            System.out.println(" Price =" +price.get(i));
        }

      
    }
}
