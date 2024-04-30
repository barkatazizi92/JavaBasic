package homeWork5;
/*
**For you to do:**
create method and name as m1. Inside your method body add print statement as "m1 method implementation"
create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
Call these two methods in the main method

**Expected Output**:
m1 method implementation
m2 method implementation
 */

public class Hw108 {

   public void m1(){
        System.out.println("m1 method implementation");
    }
    public void m2(){
        System.out.println("m2 method implementation");
    }
    void printInfo(){
        m1();
        m2();
    }

    public static void main(String[] args) {
        Hw108 hw108 = new Hw108();
        hw108.printInfo();
    }

}
