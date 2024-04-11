package class14;

public class InstanceVariableTester {

    public static void main(String[] args) {
        InstanceVariable info = new InstanceVariable();
        info.name="Barkat";
        info.lastName= "Milad";
        info.country="US";
        info.job="Software tester";
        info.age=28;
        info.salaryPerHour=35.50f;
        info.workHourAWeek=40;
        System.out.println("Name "+ info.name);
        System.out.println("Last Name "+info.lastName);
        System.out.println("country "+info.country);
        System.out.println("Job "+ info.job);
        System.out.println("age " +info.age);
        System.out.println("Salary Per Hour " +info.salaryPerHour);
        System.out.println("Work Hour a Week "+info.workHourAWeek);
        System.out.println();
        InstanceVariable ID2= new InstanceVariable();
        ID2.name="Latifa";
        ID2.lastName="Milad";
        ID2.age=12;
        ID2.country="US";
        ID2.job="Software tester";
        ID2.salaryPerHour=35.50f;
        ID2.workHourAWeek=40;
        System.out.println("Name "+ ID2.name);
        System.out.println("Last Name "+ID2.lastName);
        System.out.println("country "+ID2.country);
        System.out.println("Job "+ ID2.job);
        System.out.println("age " +ID2.age);
        System.out.println("Salary Per Hour " +ID2.salaryPerHour);
        System.out.println("Work Hour a Week "+ID2.workHourAWeek);

    }
}
