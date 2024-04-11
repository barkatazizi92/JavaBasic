package class11.practice;

public class TrimMethod {
    // this method remove space
    public static void main(String[] args) {
        String str ="    Welcome student    how are you ";
        System.out.println(str);
        String space = str.trim();
        System.out.println(space);
    }
}
