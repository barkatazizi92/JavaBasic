package class18;

/*
Create a method to find the minimum of two numbers. Method will be passed two parameters
 and will return the minimum number. Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5

Use separate class to test your code
 */
public class Task3 {

    public int minimumTwoNumber(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public double minimumTwoNumber(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}

class Task3Tester {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int minimum = task3.minimumTwoNumber(12,34);
        System.out.println(minimum);
        double minimumDouble =task3.minimumTwoNumber(3.5,6.7);
        System.out.println(minimumDouble);


    }
}

