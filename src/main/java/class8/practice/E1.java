package class8.practice;

public class E1 {
    public static void main(String[] args) {
        int []numbers={10,23,44,55};

        for (int n: numbers){
            if(n>30){
                continue;
            }
            System.out.println(n+2);
        }
    }
}
