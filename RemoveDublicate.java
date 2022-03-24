package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDublicate {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(45);
        l.add(12);
        l.add(13);
        l.add(22);
        l.add(0);
        l.add(0);
        System.out.println(l);
        Iterator<Integer> iterator=l.iterator();
        System.out.println("List elements : ");
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            HashSet<Integer> set=new HashSet<>(l);
            set.clear();
            set.addAll(l);
            System.out.println(set);
        }



    }
}
