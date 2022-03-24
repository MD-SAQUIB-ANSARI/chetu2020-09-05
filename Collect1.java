package Collection;
import java.util.*;
import java.util.ArrayList;
public class Collect1 {
    public static void main(String[] args) {
        ArrayList number = new ArrayList();
        number.add(100);
        number.add("XXXXX");
        number.add(57.756);
        System.out.println("ArrayList: " + number);
        // create copy of number
        ArrayList cloneNumber = (ArrayList)number.clone();
        System.out.println("Cloned ArrayList: " + cloneNumber);
        ArrayList L4=new ArrayList();
        L4.add(3432);
        L4.add("java");
        L4.add("javascreipt");
        L4.add("pythone");
        L4.add("HTML");
        System.out.println(L4);
        System.out.println(L4.contains("HTML"));
        //String str=L4.get(4);
        System.out.println(L4.get(4));
        System.out.println("get tmethodsuse ");
        L4.clear();
        System.out.println(L4);

       ArrayList L=new ArrayList();
        L.add(1234);
        L.add("saquoin");
        L.add(44.65);
        L.add(1234);
         System.out.println(L);
        L.removeAll(L);
        System.out.println(L);

        LinkedList L1=new LinkedList();
        L1.add(23);
        L1.add("rose");
        L1.add(55);
        L1.add(21);
        L1.add(21);
        L1.add("saquib");
        L1.addAll(L);
        System.out.println(L1);
        System.out.println(L1);

        Vector L2=new Vector();
        L2.add(11);
        L2.add(13);
        L2.add("saquibbbbbbbbbbb");
        L.add(true);

        System.out.println("boolenb");
        System.out.println(L2);
        ArrayList L3=new ArrayList();
        L3.add(1111);
        L3.add(23);
        L3.add("SAQUIB bhgafaplye");
        L3.add(54.756f);
        L3.add("abcd");
        L3.toArray();
        L3.retainAll(L3);
        L3.toString();

        L3.lastIndexOf("SAQUIB");
        L3.lastIndexOf(111)

;        System.out.println();
        System.out.println(L3);
        L3.remove(1111);
            }
        }


