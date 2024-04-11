package class20;

public class EmployeeManagementTester {
    public static void main(String[] args) {
        Employee [] employees= {new FullTimeEmployee("Hamid",34,"IT"),
                new PartTimeEmployee("Jan",45,"Network"),
                new Intern("Mal", 56,"Software Testing")};

        for (int i =0; i< employees.length; i++){
           Employee emp = employees[i];
           emp.printInfo();
           emp.calculateSalary();
           emp.reportWork();
            System.out.println();
        }

    }

}
