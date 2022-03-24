package Collection;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
    //  ArrayList<String> l = new ArrayList<>();
    //  LinkedList<String> l=new LinkedList<>();
      Vector<String> l=new Vector<>();
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
      Iterator<String> iterator = l.iterator();
      while (iterator.hasNext()) {
        String str = iterator.next();
        for (String str1 : l) {
          //System.out.println(Collections.frequency(l,str));
           int x=Collections.frequency(l,str);
          System.out.println(x);
        }
      }
    }}
