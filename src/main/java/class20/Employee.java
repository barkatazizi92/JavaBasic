package class20;

/*
Develop a system to manage different types of employees in a company.
Base class: Employee with fields like name, id, and department, and abstract methods calculateSalary()
and reportWork(). Subclasses: FullTimeEmployee, PartTimeEmployee, Intern with specific implementations
 of calculateSalary() based on their employment type. For example, FullTimeEmployee might include a fixed salary,
 whereas PartTimeEmployee salary might depend on the hours worked. Tester class: EmployeeManagementTester to
 showcase calculating salaries and reporting work for different employee types.
 */
public abstract class Employee {

    private String name;
    private int id;
    private String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract void calculateSalary();

    public abstract void reportWork();

    void printInfo() {
        System.out.println(name + " " + id + " " + department);
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    public void calculateSalary() {
        System.out.println(6000);
    }

    @Override
    public void reportWork() {
        System.out.println("He works 40 hours a week");
    }
}

class PartTimeEmployee extends Employee {


    PartTimeEmployee(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    public void calculateSalary() {
        System.out.println(3000);
    }

    @Override
    public void reportWork() {
        System.out.println("He works 20 hours a week");
    }
}

class Intern extends Employee {

    Intern(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    public void calculateSalary() {
        System.out.println(1000);
    }

    @Override
    public void reportWork() {
        System.out.println("He works 40 hours a week");
    }
}
