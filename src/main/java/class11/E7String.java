package class11;

public class E7String {
    public static void main(String[] args) {
    String str="Matt is going to regret soon";
        System.out.println(str.charAt(2));
    int sumt=0;
    int count=0;
        for(int i =0; i<str.length(); i++){
            if (str.equals("t")) {
                System.out.println(str.charAt(i));
                sumt=sumt+str.charAt(i);
                count++;
            }
        }
        System.out.println(sumt);
    }
}

