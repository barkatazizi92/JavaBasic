package class5;

public class LogicalOperatorOr9 {

    public static void main(String[] args) {

        double bankBalance = 500;
        double cash= 400;

        if (bankBalance>30000 || cash>30000){
            System.out.println("I can go buy a Toyota Corolla");
        }else
            System.out.println("I need to save more");

    }
}