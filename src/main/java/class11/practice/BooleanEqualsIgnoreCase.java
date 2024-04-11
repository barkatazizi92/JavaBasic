package class11.practice;

public class BooleanEqualsIgnoreCase {
    // this method compares this string to another string and ignore case consideration.
    public static void main(String[] args) {
        String name ="Kabul Afghanistan";
        String name2 ="kabul afghanistan";
        boolean compares = name.equalsIgnoreCase(name2);
        System.out.println(compares);
        System.out.println(name.equalsIgnoreCase(name2));
    }
}
