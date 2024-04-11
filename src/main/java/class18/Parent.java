package class18;
/*
super. method point to  variable which is inside the parent class.
 this. method point to variable which is  inside the child class and have
  the same name variable us a parent class.
 just method point to local variable inside the method in child class.
 */
public class Parent {
    String firstName="Jack";
}

class Child extends Parent{
    String firstName ="Taras java Guru";

    void printName(){
        String firstName ="sum";
        System.out.println(super.firstName);
    }
}

class parentTester{
    public static void main(String[] args) {
        Child child = new Child();
        child.printName();
    }
}

