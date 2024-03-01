package class4;

public class Task4IfElse {

    public static void main(String[] args) {

        boolean degree = true;
        double scoreGpa = 3.5;

        if (degree) {
            System.out.println("congratulations");
            if (scoreGpa > 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }
        } else {
            System.out.println("You should get a degree");
        }
    }
}

