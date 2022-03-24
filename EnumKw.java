package Collection;

public class EnumKw {
    //Enumeration defined
//    enum Subject
//    {
//        Java, Cpp, C, Dbms
//    }
    enum WeekDays{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    class Demo
    {
        public static void main(String args[])
        {
            WeekDays wk; 			//wk is an enumeration variable of type WeekDays
            wk = WeekDays.SUNDAY; 	//wk can be assigned only the constants defined under enum type Weekdays
            System.out.println("Today is "+wk);
        }
    }
}
