package barkatExercise;

public class Task1 {
    /*/
    i, Write a Java program to add, subtract, multiply and divide 2 decimal values.
    Your program should say.
    “The___ of 2numbers___ and ___is equal to.
    ”The addition of 2 numbers 10 and 20 is equal to 30
     */
    public static void main(String[] args) {
        double num=5.0;
        double num1= 6.0;
        System.out.println("The addition of 2 numbers " + num+ " and " +num1+ " is equal to "+(num+num1));
        System.out.println("The subtract of 2 numbers " + num+ " and " +num1+ " is equal to " +(num-num1));
        System.out.println("The multiplication of 2 numbers " + num+ " and " +num1+ " is equal to "+num*num1);
        System.out.println("The division of 2 numbers " + num+ " and " +num1+ " is equal to "+num/num1);
    }
}
