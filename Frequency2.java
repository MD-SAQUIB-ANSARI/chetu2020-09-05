package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Frequency2 {
    public static void main(String[] args) {
       // Vector<String> l=new Vector<>();
        LinkedList<String> l=new LinkedList<>();
        l.add("a");
        l.add("a");
        l.add("b");
        l.add("a");
        l.add("c");
        l.add("b");
        l.add("a");
        l.add("a");
        l.add("c");
        System.out.println(l);
        ListIterator<String> listIterator=l.listIterator();
        while (listIterator.hasNext())
        {
            String str=listIterator.next();
            for (String str1:l)
            System.out.println(Collections.frequency(l,str));
        }

    }
}
