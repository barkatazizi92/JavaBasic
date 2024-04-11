package class14;

public class Students {
    String name = "";
    int ID =0;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students stu1 = new Students();
        stu1.name= "jajajaa";
        stu1.ID=1;
        Students.numberOfStudents++;

        System.out.println(stu1.name);
        System.out.println(stu1.ID);
        System.out.println(Students.numberOfStudents);
        System.out.println();

        Students stu2 = new Students();
        stu2.ID=2;
        stu2.name="wajwajaha";
        Students.numberOfStudents++;
        System.out.println(stu2.name);
        System.out.println(stu2.ID);
        System.out.println(Students.numberOfStudents);
        System.out.println();

        Students stu3 = new Students();
        stu3.name="papapap";
        stu3.ID=3;
        Students.numberOfStudents++;
        System.out.println(stu3.ID);
        System.out.println(stu3.name);
        System.out.println(Students.numberOfStudents);
    }
}
