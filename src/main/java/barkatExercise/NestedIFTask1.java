package barkatExercise;
/*
write a program to store a value whether user has degree or not. if user has a degree ,
you should say congratulation and after that check if gpa score is higher or equals 3.5
output should say "you are eligible for scholarship", otherwise " You should have studied harder.
if user does not have a degree print you should get a degree.
 */
public class NestedIFTask1 {
    public static void main(String[] args) {
        boolean degree = false;
        double gpa = 3.4;
        if (degree){
            System.out.println("Congratulation");

            if (gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else
                System.out.println("You should have studied harder");

        } else
            System.out.println("You should get a degree");
    }
}
