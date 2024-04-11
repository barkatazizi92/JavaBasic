package class12.Tasks;
/*
create a method that will print whether given String is palindrome or not.
 */
public class Task4 {
    public static void main(String[] args) {
        String isPalindrome = "baa";
        StringBuilder pal = new StringBuilder(isPalindrome);
        pal.reverse();
       String convert = pal.toString();
       if(isPalindrome.equals(convert)){
           System.out.println(true);
       }else {
           System.out.println(false);
       }
    }
}
