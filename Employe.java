package Collection;
import java.util.ArrayList;
//import java.util.Collections;
public class Employe {
    private  Integer empNo;
    private String empName;
    private Double empSalry;
    Employe(Integer empNo,String empName,Double empSalry)
    {
        this.empNo=empNo;
        this.empName=empName;
        this.empSalry=empSalry;
    }
    @Override
    public String toString() {
        return "Employe{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empSalry=" + empSalry +
                ", to='" +  + '\'' +
                '}';
    }
}
class  InterfaDemo
{
    public static void main(String[] args) {
        ArrayList<Employe> L=new ArrayList<>();
        L.add(new Employe(101,"SAQUIB",17000.19));
        L.add(new Employe(102,"ROSE",12000.19));
        L.add(new Employe(103,"ANSARI",15000.19));
        L.add(new Employe(104,"SHAINIYA",14000.19));
        System.out.println(L);
       // Collections.sort(L);
       // System.out.println(L);
    }
}
