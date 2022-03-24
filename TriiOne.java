package Collection;
import java.util.TreeSet;
public class TriiOne {
    public static void main(String[] args) {
        //it is sorted alos
                TreeSet evenNumbers = new TreeSet();
                evenNumbers.add(2);
                evenNumbers.add(4);
                evenNumbers.add(6);
                evenNumbers.add(5);
                System.out.println("TreeSet: " + evenNumbers);
                TreeSet numbers = new TreeSet<>();
                numbers.add(1);
                numbers.add(2);
                numbers.add(3);
                numbers.add(44);
                System.out.println(evenNumbers);
                System.out.println("New TreeSet: " + numbers);
                TreeSet l=new TreeSet();
                //only saqme value add krega int mai int
                 System.out.println(l);
                 numbers.add(4);
                 l.addAll(numbers);
                 System.out.println(l);
            }
        }


