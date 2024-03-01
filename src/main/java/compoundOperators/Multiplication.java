package compoundOperators;

public class Multiplication {

    public static void main(String[] args) {

        int book = 2;

        // old way to muliply and update the value
        book = book*3;

        // compound operator
        book *= 2;
        book *= 1;
        book *= 3;


        System.out.println(book);
    }
}
