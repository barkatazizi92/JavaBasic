package class19;

import class16.Students;

public class Student {

    void onTime() {
        System.out.println("Students are on time");
    }

    void studyHard() {
        System.out.println("Students are study hard");
    }

    void living() {
        System.out.println("living on campus");
    }
}

class SyntaxStudent extends Student {
    void studyHard() {
        System.out.println("Study kind of hard but not really");
    }
    void living(){
        System.out.println("Living in different city");
    }

}

class CollegeStudent extends Student {
    void onTime() {
        System.out.println("Not really time");
    }
}

class SchoolStudent extends Student{
    void living() {
        System.out.println("They are living on their house");
    }

}
