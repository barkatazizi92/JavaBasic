package class24;

import java.util.HashSet;
import java.util.Set;

public class E4 {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(12);
        numbers.add(12);
        numbers.add(54);
        numbers.add(45);
        System.out.println(numbers);

        for (Integer num: numbers){
            System.out.println(num);
        }
        System.out.println("++++++");
        numbers.forEach(x-> System.out.println(x));
    }
}
