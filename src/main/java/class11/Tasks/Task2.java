package class11.Tasks;
/*
Create a String and print it in reverse order(Sunday = yadnuS)
 */
public class Task2 {
    public static void main(String[] args) {
        String day = "Sunday";
        for (int i =day.length()-1; i>0; i--){
            System.out.println(day.charAt(i));
        }
    }
}
