package class25;

import java.util.Set;
import java.util.TreeMap;

public class E3TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> fruit = new TreeMap<>();
        fruit.put("Kiwi", 25.2);
        fruit.put("Apple", 10.5);
        fruit.put("Orange", 5.5);
        fruit.put("Banana", 30.5);
        // why you use Set?
       Set<String> keys = fruit.keySet();
        System.out.println(keys);

        System.out.println();

        for(String k: keys){
            System.out.println(k);
        }
        System.out.println();

        keys.forEach(x-> System.out.println(x));

    }
}
