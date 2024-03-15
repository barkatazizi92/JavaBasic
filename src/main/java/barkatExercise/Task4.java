package barkatExercise;
/*
write a program to find the largest number among three numbers stored in three variable
 called as num1, num2, num3, using nested if (numbers must be distinct)
 */
public class Task4 {
    public static void main(String[] args) {
        int num1=9;
        int num2=66;
        int num3=141;
        if (true){
            if(num1>num2 && num1>num3){
                System.out.println("Num1 is greater "+num1);

            }else if (num2>num1 && num2>num3){
                System.out.println("Num2 is greater "+num2);

            }else
                System.out.println("Num3 is greater "+ num3);
            }
        }
    }
