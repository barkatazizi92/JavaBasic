package class5;

public class LogicalOperatorOr {

    public static void main(String[] args) {

        boolean flower = false;
        boolean chocolates = true;
        boolean giveCreditCard= false;
        if (flower || chocolates || giveCreditCard){
            System.out.println("Wife is Happy");
        }else{
            System.out.println("Wife is sad and run out of the home");
        }

    }
}