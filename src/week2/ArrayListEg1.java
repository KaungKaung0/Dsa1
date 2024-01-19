package week2;
import java.util.ArrayList;

public class ArrayListEg1 {
    

    public static void main(String[] args) {
        
        ArrayList<String>userlist = new ArrayList<>();

        userlist.add("User1");
        userlist.add("User2");
        userlist.add("User3");
        userlist.add("User4");

        for (int i=0;i<userlist.size();i++)
        {
            System.out.println("user name is " + userlist.get(i));
        }

    }
}
