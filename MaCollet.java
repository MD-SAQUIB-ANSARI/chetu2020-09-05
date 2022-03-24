package Collection;

import java.util.HashMap;
import java.util.Map;

public class MaCollet {
    public static void main(String[] args) {
   HashMap<Integer,String> l=new <Integer> HashMap();
   l.put(1,"saquib");
   l.put(6,"aaa");
   l.put(5,"java");
   l.put(3,"rose");
   l.put(4,"saquib");
   // noo rept key l.put(1,1234);
//        System.out.println(l);
//       String  str=l.get(1);
//       System.out.println(str);
//        String  x=l.get(3);
//        System.out.println(x);

//                HashMap<Integer, String> languages = new HashMap<>();
//                languages.put(1, "Java");
//                languages.put(2, "Python");
//                languages.put(3, "JavaScript");
//                System.out.println("HashMap: " + languages);
//
//                // get() method to get value
//                String value = languages.get(1);
//                System.out.println("Value at index 1: " + value);

        System.out.println(l.keySet());
        System.out.println(l.containsKey(1));
        System.out.println(l.entrySet());
        System.out.println(l.isEmpty());
        System.out.println(l.size());
       //dot ha  System.out.println(l.clone());
        System.out.println(l.containsValue("saquib"));
        System.out.println(l.containsValue("java"));
        ;HashMap<Integer,String> str=new HashMap<>();
        str.put(2,"java and c");
        System.out.println(str);
//        System.out.println(str.putAll(l));
           }
        }


