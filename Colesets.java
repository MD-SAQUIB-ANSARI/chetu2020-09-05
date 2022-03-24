package Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Colesets {
     public static void main(String[] args) {
     Set l9=new HashSet();
          // dose not insertion order
         // Set l9=new LinkedHashSet();
     l9.add(123);
     l9.add("saquib ansari ");
     l9.add("rose");
     l9.add('s');
     l9.add(1.2);
     l9.add(123);
     l9.add(20);
         System.out.println(l9);
//    insertion not posbli
    Set l=new LinkedHashSet();
     l.add(9090);
     l9.addAll(l);
     System.out.println(l9);
     Set l10=new LinkedHashSet();
      Boolean atr1=l10.isEmpty();
          System.out.println(l10);
          boolean atr2=l10.isEmpty();
          System.out.println(l10);
     boolean atr=l9.isEmpty();
         if(atr2==true)
          if(atr==true)
     {
          System.out.println("is found");
     }
     else
     {
          System.out.println("not found");
     };
    // TreeSet<Integer>
}
}
