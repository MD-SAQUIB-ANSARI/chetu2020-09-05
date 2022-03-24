package Collection;

import java.util.Collections;
import java.util.LinkedList;
public class Frequency1 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        l.add("java");
        l.add("c");
        l.add("c++");
        l.add("python");
        l.add("c");
//        for ( String str:l) {
            System.out.println("frequency of the word " + l + Collections.frequency(l, "java"));

    }
}
