package class11.practice;

public class MethodLength {
    // method length return the length of the string
    public static void main(String[] args) {
        String str = new String("Good morning buddy");
        String string = "Good evening";
        //System.out.println(str.length());
        int len = string.length();
        System.out.println(len);

        String str1 = new String("Welcome Student");
        String str2 = new String ("Tutorials");
        System.out.println(str1.length());
        System.out.println(str2.length());
    }
}
