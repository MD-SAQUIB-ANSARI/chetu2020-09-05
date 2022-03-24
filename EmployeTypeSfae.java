package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class EmployeTypeSfae implements  Comparable/*<EmployeTypeSfae>*/ {
    private Integer empNo;
    private String empName;
    private Double empSalary;
    EmployeTypeSfae(Integer EmpNo, String empName, Double empSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "EmployeTypeSfae{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        EmployeTypeSfae e = (EmployeTypeSfae) o;
        if (empNo == e.empNo)
            return 0;
        else if (empName ==e. empName)
            return 1;
        else
            return -1;
    }
}
 class InterfaceDeno{
    public static void main(String[] args) {
        List<EmployeTypeSfae>L=new ArrayList();
        L.add(new EmployeTypeSfae(101,"SAZZAD ANDASRI",12344.11));
        L.add(new EmployeTypeSfae(1020,"SAZZAD CHETU",19365.11));
        L.add(new EmployeTypeSfae(1019,"SAZZAD CHETU",1236.11));
        System.out.println(L);
        Collections.sort(L);
        System.out.println("---------");
        Collections.sort(L,Collections.reverseOrder());
        System.out.println("----------");
        System.out.println(L);
    }
}

