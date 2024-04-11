package class11;

public class E11String {
    public static void main(String[] args) {

        String str="sdjfshKJDHFS982154@@@##@&*";
        System.out.println(str.replaceAll("[3-5]","**"));
        System.out.println(str.replaceAll("[a-n]","BBB"));
        System.out.println(str.replaceAll("^a-z",""));
    }
}

