package Collection;
import java.util.HashSet;
public class Colesets2 {
    public static void main(String[] args) {
        HashSet<Integer> l=new HashSet<>();
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(111);
        l.add(122);
        Integer val=11;
        System.out.println(l.contains(val));
        Integer value=123;
        System.out.println(l.contains(value));

    }

}
