package review9;

import java.util.ArrayList;

public class E3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int sum = 0;
       for ( int i =0 ; i < numbers.size(); i++){
           sum=sum+numbers.get(i);
       }
        System.out.println(sum);
    }
}
