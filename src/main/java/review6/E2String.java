package review6;

public class E2String {
    public static void main(String[] args) {
        String str ="Java is not easy";
       char c = str.charAt(0);
       int count =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
