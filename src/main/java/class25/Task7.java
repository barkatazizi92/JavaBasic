package class25;

import java.util.ArrayList;
import java.util.List;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Task7 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(24);
        number.add(23);
        number.add(26);
        number.add(26);
        System.out.println(number);

        int sum = 0;
        for(Integer num : number){
            sum=sum+num;
        }
        System.out.println(sum );
    }
}
