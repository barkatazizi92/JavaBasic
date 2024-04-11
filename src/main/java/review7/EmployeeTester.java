package review7;

public class EmployeeTester {
    public static void main(String[] args) {
        System.out.println(Employee.companyName);
        String name = Employee.getCompanyName();
        System.out.println(name);

       Employee obj1 = new Employee("Will", 55,55555);
       double result = obj1.getBonus();
       obj1.printInfo();
    }
}
