package class28ExceptionHandling;

public class E1Exception {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e ){
            System.out.println("Write a non zero value");
        }
            System.out.println("4");
            System.out.println("5");

    }
}
