package Collection;
import java.util.Collections;
import java.util.LinkedList;
public class LinkLitRevers {
    public static void main(String[] args) {
//    LinkedList<Integer> l=new LinkedList<>();
//    l.add(32);
//    l.add(97);
//    l.add(876);
//    l.add(65544);
//        Collections.sort(l);
//        System.out.println(l);
//        Collections.reverse(l);
//        System.out.println(l);
        LinkedList<String > str=new LinkedList<>();
        str.add("aaaa");
        str.add("ghfgf");
        str.add("cccc");
        str.add("bbbb");
        Collections.sort(str);
        System.out.println(str);
        System.out.println(str.toString());
        Collections.reverse(str);
        System.out.println(str);
}}
