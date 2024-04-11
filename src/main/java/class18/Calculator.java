package class18;

public class Calculator {

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public void add(long a, long b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(int a, double b){
        System.out.println(a+b);
    }
}
class CalculatorTester{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(1,3);
        cal.add(2.3,3.3);
        cal.add(3l,4l);
        cal.add(1,3,5);
        cal.add(2,3.4);
    }
}
