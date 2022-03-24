package Collection;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
public class LinkList {
    public static void main(String[] args) {
//        LinkedList l = new LinkedList();
//        l.add(123);
//        l.add("saquib");
//        l.add("java");
//        l.add("chetu");
//        l.add("7004339423");
//        l.add("my contact no is");
//        System.out.println(l);
//        l.add(2,"saquib");
//        System.out.println(l);
//         l.addFirst(900000);
//        System.out.println(l);
//        // l.getFirst();
//        // dot  l.getLast();
//         l.indexOf(l);
//          System.out.println(l);
//             l.offerFirst("xxxxxxx ya int valur vhi");
//             l.offerFirst(234567);
//             l.offerLast("yyyyyyyy");
//             l.offer("aaaaaaaa");
//           System.out.println(l);
//        l.poll();
//        System.out.println(l);
//        Object arr[]=l.toArray();
//        for (Object str:arr)
//        System.out.println(str);
//        l.pollFirst();
//        System.out.println(l);
//        l.peekFirst();
//       System.out.println(l);
//        LinkedList l2 = new LinkedList();
//        l2.add(12);
//        l2.add(87);
//        l2.add(9988);
//        l2.add(99.99);
//        l2.add(100);
//        Collections.sort(l2);
//        System.out.println(l2);
//        l2.add(123);
//      dot ha        if(l.containsAll(l2))
//            System.out.println("found");
//        else
//            System.out.println("not found");
//  l.add(new Date());
//        System.out.println(l);
//        l2.remove(0);
//        System.out.println(l2);
//        l2.removeAll(l2);
//        System.out.println(l2);
//        System.out.println(l.remove("java"));
//        System.out.println(l2);
//        l.retainAll(l2);
//        System.out.println(l);
//        l2.retainAll(l);
//        System.out.println(l2);
        LinkedList l3 = new LinkedList();
        l3.add(123);
        l3.add(234);
        l3.add(432);
        l3.add(6657);
        l3.add("aaa");
        l3.add("bbbbbbb");
        l3.add("ccccc");
        l3.get(0);
//        Boolean o = (Boolean) l3.get(2);
//        System.out.println(o);
        l3.get(4);
        System.out.println(l3.get(3));
        System.out.println(l3.size());
        System.out.println(l3.remove(123));
        System.out.println(l3.addAll(234,l3));
        Object arr[] = l3.toArray();
        for (Object str1 : arr) {
            System.out.print( "," +
                    "  " +str1);
        }
    }
}


