package class25.practice;

import java.util.Set;
import java.util.TreeMap;

public class RemoveMethod {

    public static void main(String[] args) {
        TreeMap<String, Double> fruit = new TreeMap();
        fruit.put("Kiwi", 25.2);
        fruit.put("Apple", 10.5);
        fruit.put("Orange", 5.5);
        fruit.put("Banana", 30.5);

        // if we want to extract both parameter we use this way
        fruit.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println();

        Set<String> keys = fruit.keySet();
        keys.removeIf(x->x.contains("e")|| x.contains("B"));
        System.out.println(keys);

    }
}
