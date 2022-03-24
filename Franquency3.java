package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
public class Franquency3 {
    public static void main(String[]args) {
        ArrayList<String> l=new ArrayList<>();
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
        HashSet<String > set=new HashSet<>(l);
        for (String str:set)
            System.out.println(str +": "+Collections.frequency(l,str));
    }
    }

