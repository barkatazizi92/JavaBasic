package class16;

public class Employee {
    private String name;
    private String id;
    private int age;
    private double salary;

   public Employee(String eName, String eId, int EAge, double ESalary){
        name=eName;
        id=eId;
        age=EAge;
        salary=ESalary;
    }

    void printName(){
        System.out.println(name);
    }

    void printInfo(){
        System.out.println(name+" "+ id+ " "+age+" "+" "+salary);
    }
}
