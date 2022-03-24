package Collection;
import java.util.ArrayList;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       // ArrayList<String> memory = new ArrayList();
        LinkList memory=new LinkList();
       // Vector memory=new Vector();
        System.out.println("plese enter the value of array list no");
        while(true)
        {
           // memory.add(reader.nextLine());
           System.out.println(memory.toString());
            System.out.println(memory);
        }
    }
}
