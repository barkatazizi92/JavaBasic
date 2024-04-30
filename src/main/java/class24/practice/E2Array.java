package class24.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E2Array {
    public static void main(String[] args) {
        long startsTime =System.currentTimeMillis();
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 12000; i++){
            number.add(i);

        }
        long endTime = System.currentTimeMillis();
        System.out.println(number);
        System.out.println(endTime-startsTime);


    }
}
