package review6;

public class E8String {
    public static void main(String[] args) {
        String str = "I_am_taylor_swift_   Nikola_here_is_my_number_911";
       String [] arr = str.split("[_]");
        System.out.println(arr[4].trim());// trim is remove the space before Nikola
    }
}
