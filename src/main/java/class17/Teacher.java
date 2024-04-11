package class17;

public class Teacher {
    String name;
    String lastName;
    double salary;
    int yearsExperience;
    void printInfo() {
        System.out.println(name + " " + lastName + " " + salary + " " + yearsExperience);
    }
}
class MathTeacher extends Teacher {
    void teach1() {
        System.out.println("Teach math");
    }
}
class ChemistryTeacher extends Teacher {
    void teach2() {
        System.out.println("Teach Chemistry");
    }
}
class PianoTeacher extends Teacher {
    void teach3() {
        System.out.println("Teach Piano");
    }
}
class teacherTester {
    public static void main(String[] args) {
        MathTeacher math = new MathTeacher();
        math.name = "John";
        math.lastName = "Hamid";
        math.salary = 12000;
        math.yearsExperience = 18;
        math.teach1();
        math.printInfo();
        System.out.println();

        ChemistryTeacher chemistry = new ChemistryTeacher();
        chemistry.name = "Jay";
        chemistry.lastName = "Mila";
        chemistry.salary = 8000;
        chemistry.yearsExperience = 10;
        chemistry.teach2();
        chemistry.printInfo();
        System.out.println();

        PianoTeacher piano = new PianoTeacher();
        piano.name = "Mosa";
        piano.lastName = "Easa";
        piano.salary = 2333;
        piano.yearsExperience = 5;
        piano.teach3();
        piano.printInfo();
    }
}

