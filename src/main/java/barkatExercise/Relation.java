package barkatExercise;

public class Relation {
    public static void main(String[] args) {
        int number = 15;
        int number2= 20;
        System.out.println(number==number2);
        System.out.println(7==8);


        char word= 'B';
        char word2= 'b';
        boolean result= word==word2;
        System.out.println(result);

        long tv = 233434;
        int md = 233434;
        boolean result1 = tv==md;
        System.out.println(result1);

        double de = 3.4;
        float fe = 4.4f;
        System.out.println(de!=fe);

        byte you = 13;
        short me = 15;
        System.out.println(you>me);
        System.out.println(me>you);

        int d = 15;
        int a = 15;
        boolean res = d<=a;
        System.out.println(res);

        int s = 8;
        int ya = 6;

        System.out.println(s<ya);
    }
}