package class3homew;

public class TypeCasting {

    public static void main(String[] args) {

        // converting the byte to integer
        byte price = 100;
        int rate = price; // type casting
        System.out.println(rate);

        int h = 3000;
        byte ah = (byte) h; // narrowing type casting .
        System.out.println(ah);


        double num = 10.5;
        int number = (int) num;// Narrowing type casting.
        System.out.println(number);

        int N = 10;
        float nn = N;
        System.out.println(nn);
    }
}
