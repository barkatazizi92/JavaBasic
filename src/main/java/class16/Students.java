package class16;

import class13.Student;

/*
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
 Inside your class also have a method to Calculate Average Grade. Test Student class for 2 different
 students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
 */
public class Students {
    private String name;
    private int grades1;
    private int grades2;
    private int grades3;

    public Students(String name, int grades1, int grades2, int grades3){
        this.name=name;
        this.grades1=grades1;
        this.grades2=grades2;
        this.grades3=grades3;
    }
    int averageGrade(){
        return(grades1+grades2+grades3)/3;
    }
    public void printInfo(){
        System.out.println(name+grades1+grades2+grades3);
    }
    public static void main(String[] args) {
        Students student1 = new Students("Barkat", 99,89,100);
        Students student2 = new Students("Milad", 99,98,95);
        System.out.println("The average number of "+ student1.name+" = "+student1.averageGrade());
        System.out.println("The average number of "+student2.name+ " = "+ student2.averageGrade());
    }
    }

