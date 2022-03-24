package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumrater1 {
    public static void main(String[] args) {
//        Vector<Integer> v=new Vector<>();
//        v.add(10);
//        v.add(20);
//        v.add(30);
//        v.add(40);
        Vector<String> v=new Vector<>();
        v.add("saquib");
        v.add("a");
        v.add("b");
        System.out.println(v);
        Enumeration e=v.elements();
        while (e.hasMoreElements());
        {
            //int i = (Integer) e.nextElement();
            String str= (String) e.nextElement();
            System.out.println(str+ " ");
        }
    }
}
