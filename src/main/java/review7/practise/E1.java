package review7.practise;
/*
Can we use instance variable inside static method or variable ? no we cannot,
 */
public class E1 {

    private int number1;
    private int number2;

    public static void main(String[] args) {
        E1 e = new E1();
        int ne = e.number1=3;
       int nee = e.number2=4;
        System.out.println(ne+nee);
    }
    }

