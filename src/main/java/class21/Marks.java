package class21;
/*
We have to calculate the average of marks obtained in three subjects by student A and in
 4 subjects by student B. Create class 'Marks' with an abstract method 'getAverage'
 that will be returning the average of marks. Provide implementation of abstract method in classes
  'A' and 'B'. The constructor of student A takes the marks in three subjects its parameters
and the marks in four subjects as its parameters for student B. Test your code
 */
public abstract class Marks {
  abstract double getAverage();
  }

class A extends Marks{
    private int subject1;
    private int subject2;
    private int subject3;

    A(int subject1, int subject2, int subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    @Override
    double getAverage() {
        return (subject1+subject2+subject3)/3;
    }
}
class B extends Marks{
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    B(int subject1,int subject2,int subject3, int subject4){
        this.subject1=subject1;
    }

    @Override
    double getAverage() {
        return (subject1+subject2+subject3+subject4)/4;
    }
}
