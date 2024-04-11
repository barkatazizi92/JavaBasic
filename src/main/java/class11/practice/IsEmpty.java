package class11.practice;

public class IsEmpty {
    public static void main(String[] args) {
        //This method checks weather the string is empty or not?
        String str = "Hello sir";
        System.out.println(str.isEmpty());

        String number ="123345";
        System.out.println(number.isEmpty());
        System.out.println(number.isBlank());
        String str2= new String("");
        System.out.println(str2.isEmpty());

        String str3="";
        boolean b=str3.isEmpty();
        System.out.println(b);
    }
}
