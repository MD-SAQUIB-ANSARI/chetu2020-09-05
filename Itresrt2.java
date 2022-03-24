package Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Itresrt2 {
    public static void main(String[] args) {
        LinkedList<String> anial=new LinkedList<>();
        anial.add("tigert");
        anial.add("elephent");
        anial.add("hors");
        anial.add("zebra");
        anial.add("cow mata");
        System.out.println(anial);
       Iterator<String>  valu=anial.iterator();
       while (valu.hasNext())
       {
           String o=valu.next();
           System.out.println(o);
           if (o.equals("tigert"));
            anial.remove();
       }
       for (String str:anial)
       {
           System.out.println(str);
       }
    }
}
