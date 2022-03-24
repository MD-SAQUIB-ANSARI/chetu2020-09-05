package Collection;
import java.util.LinkedList;
import java.util.ListIterator;
public class LeastItrats {
    public static void main(String[] args) {
        LinkedList<String> animal=new LinkedList<>();
        animal.add("tigers");
        animal.add("horse");
        animal.add("zeraf");
        System.out.println(animal);
        ListIterator<String> listIterator= animal.listIterator();
        System.out.println("this is a forward direction");
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("this is backward directions move ");
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
       //dot ha animal.set("cat");
//        while (listIterator.hasNext());
//        {
//            System.out.println(listIterator.);
//        }
    }
}
