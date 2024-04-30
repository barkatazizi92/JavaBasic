package class25;

import java.util.Set;
import java.util.TreeMap;

public class E4 {
    public static void main(String[] args) {
        TreeMap<String, Double> fruit = new TreeMap<>();
        fruit.put("Kiwi", 25.2);
        fruit.put("Apple", 10.5);
        fruit.put("Orange", 5.5);
        fruit.put("Banana", 30.5);
        Set<String> keys = fruit.keySet();
        keys.removeIf(x->x.contains("a")|| x.contains("A"));
        System.out.println(fruit);
    }
}
