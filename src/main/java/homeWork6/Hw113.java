package homeWork6;
/*
Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes
Step3: Call the method

**Output:**
11:30
 */
public class Hw113 {
    public void printTime(int hour , int minutes){
        System.out.println(hour+ ":"+minutes);
    }

    public static void main(String[] args) {
        Hw113 hw113 = new Hw113();
        hw113.printTime(11, 30);

    }

}
