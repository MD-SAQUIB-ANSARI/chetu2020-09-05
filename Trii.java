package Collection;

import java.util.TreeSet;

public class Trii {
    public static void main(String[] args) {
        TreeSet l=new TreeSet();
//        l.add("saquib");
//        l.add("aaaa");
//        l.add("ssssss");
        l.add(45242);
        l.add(222);
        l.add(2345);
        l.add(9090);
        l.add(0000);
        //ye nhi lega ek jisa value hona chhiye l.add(242.122);
        l.add(333);
        System.out.println(l);
       System.out.println(l.ceiling(4));
        System.out.println(l.higher(45242));
        System.out.println(l.floor(0));
        System.out.println(l.lower(0));
    }
}
