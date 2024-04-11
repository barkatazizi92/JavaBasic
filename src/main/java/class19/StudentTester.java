package class19;

import class17.Teacher;

public class StudentTester {
    public static void main(String[] args) {
        Student [] arr={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for (int i = 0; i<arr.length; i++){
          Student s  =  arr[i];
          s.studyHard();
          s.onTime();
          s.living();
            System.out.println();
        }
    }

}
