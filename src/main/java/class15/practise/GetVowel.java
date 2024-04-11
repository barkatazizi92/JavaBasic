package class15.practise;
/* Create a method that will accept a String as a parameter and return a new String that
consist only of vowels. Method should be available inside the class only where
it was declared and executed by calling it is name.  */
public class GetVowel {
    private static String vowel(String a){
         String getA = a.replaceAll("[^AEIOUaeiou]","");
         return getA;
    }

    public static void main(String[] args) {
        System.out.println(vowel("How are you"));
    }

    }
