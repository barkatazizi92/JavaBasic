package class11.practice;

public class ReplaceAll {

    public static void main(String[] args) {
        String mix = new String("hdljfjsRDKHFSDHF1234569833*()#?><!");
        String change = mix.replaceAll("[a-h]","p");
        System.out.println(change);
        String change2=mix.replaceAll("[A-z]","&");
        System.out.println(change2);
        String change3=mix.replaceAll("[!-#]","%");
        System.out.println(change3);
        String change4=mix.replaceAll("[1-6]","B");
        System.out.println(change4);
    }
}
