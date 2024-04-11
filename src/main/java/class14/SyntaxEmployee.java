package class14;

import jdk.dynalink.beans.StaticClass;

public class SyntaxEmployee {

    int empID =0;
    int salary = 0;

    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee em = new SyntaxEmployee();
        em.empID= 1;
        em.salary = 5000;
        System.out.println(em.empID);
        System.out.println(em.salary);
        System.out.println(CEO);

        SyntaxEmployee e2 = new SyntaxEmployee();
        e2.empID=2;
        e2.salary=6000;
        System.out.println(e2.empID);
        System.out.println(e2.salary);
        System.out.println(CEO);
    }


}
