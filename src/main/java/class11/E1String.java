package class11;

public class E1String {
    public static void main(String[] args) {
        String str = new String("Today is java");
        int len =str.length(); // we store the length of inside len and then we call
        System.out.println(len);

        System.out.println(str.length()); // we directly call

        if(len>5){
            System.out.println("String is too long");
        }
    }
}
