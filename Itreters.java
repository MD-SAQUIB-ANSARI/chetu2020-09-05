package Collection;
import java.io.*;
import java.util.*;
public class Itreters {
    // Java code to illustrate the use of iterator
        public static void main(String[] args)
        {
            ArrayList<String> list = new ArrayList<String>();
          //  LinkedList<String> list=new LinkedList<>();
            list.add("A");
            list.add("B");
            list.add("B");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
            list.add("A");
            // Iterator to traverse the list
            Iterator<String> iterator = list.iterator();
            System.out.println("List elements : ");

//            String value=iterator.next();
//            System.out.println(value);
//             value=iterator.next();
//            System.out.println(value);
//             value=iterator.next();
//            System.out.println(value);
//             value=iterator.next();
//            System.out.println(value);
//            value=iterator.next();
//            System.out.println(value);
//            boolean val=iterator.hasNext();
//            System.out.println(val);
                        //ya phir aise
            while (iterator.hasNext()) {
                String val = iterator.next();
               // System.out.println(val);
               // System.out.print(iterator.next() + " ");
                //remove methods use
                for (String str:list)
                  if (val.equals("A")) {;
                      iterator.remove();
                      System.out.println(list);
                  }
                  else
                  {
                      System.out.println(val);
                  }
            }
        }
        }

