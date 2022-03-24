package Collection;

import SAQE.Array;
import SAQE.Stiring1;

import java.util.ArrayList;
import java.util.HashSet;

public class Dublicat3 {
    public static void main(String[] args) {
        ArrayList<String>  l= new ArrayList<>();
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
        HashSet<String> set=new HashSet<>(l);
        set.clear();
        set.addAll(l);
        System.out.println(set);
    }
}
