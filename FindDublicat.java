package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FindDublicat {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("r");
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
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            for (String str:l)
                    iterator.remove();
                    System.out.println(l);
                }
    }
}
