package Collection;

import java.util.*;

public class LeastItrearMaap {
    public static void main(String[] args) {
        HashMap<String,Integer> animl=new HashMap<>();
        animl.put("tiger",110);
        animl.put("horse",122);
        animl.put("cat",123);
        System.out.println(animl);
        Set s=animl.entrySet();
        Iterator ITR=s.iterator();
        while (ITR.hasNext())
        {
            System.out.println(ITR.next());
        }
        Map.Entry e=(Map.Entry)ITR.next();
        System.out.println(e.getKey()+""+e.getValue());
    }
}
//output mai dot ha

