package class14;

public class StaticVariable {

    String name;
    int age;
    static double salaryPerHour;
    char gender;
    short height;
    byte weight ;
    static String companyName;
    static String address;


    public static void main(String[] args){
        StaticVariable employ1 = new StaticVariable();
        employ1.name="Hamid";
        employ1.age=25;
        employ1.salaryPerHour=45.50;
        employ1.gender='M';
        employ1.height=180;
        employ1.weight=78;
        employ1.companyName= "Facebook";
        employ1.address="23 washington DC";
        System.out.println(employ1.name);
        System.out.println(employ1.age);
        System.out.println(employ1.salaryPerHour);
        System.out.println(employ1.gender);
        System.out.println(employ1.height);
        System.out.println(employ1.weight);
        System.out.println(employ1.companyName);
        System.out.println(employ1.address);
        System.out.println();

        StaticVariable employ2 = new StaticVariable();
        employ2.name="phia";
        employ2.age= 28;
        employ2.height=174;
        employ2.weight=80;
        employ2.gender='F';
        employ2.companyName=companyName;
        employ2.address=address;
        employ2.salaryPerHour=salaryPerHour;
        System.out.println(employ2.name);
        System.out.println(employ2.age);
        System.out.println(employ2.salaryPerHour);
        System.out.println(employ2.gender);
        System.out.println(employ2.height);
        System.out.println(employ2.weight);
        System.out.println(StaticVariable.companyName);
        System.out.println(employ2.address);
        }
    }


