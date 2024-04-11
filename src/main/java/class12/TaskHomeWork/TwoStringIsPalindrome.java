package class12.TaskHomeWork;
/*
how would you check if String is palindrome or not? ana = true.  abba = false
 */
public class TwoStringIsPalindrome {
    public static void main(String[] args) {
        String a = "aba";
        StringBuilder ab = new StringBuilder(a);
        ab.reverse();

        String isplindrome =ab.toString();

        if (a.equals(isplindrome)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
