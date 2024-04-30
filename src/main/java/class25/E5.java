package class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E5 {
    public static void main(String[] args) {
        TreeMap<String, Double> fruit = new TreeMap<>();
        fruit.put("Kiwi", 25.2);
        fruit.put("Apple", 10.5);
        fruit.put("Orange", 5.5);
        fruit.put("Banana", 30.5);
     // Collection<Double> values =  fruit.values();
        System.out.println(fruit.values());
        var values = fruit.values();
        values.removeIf(x->x>10);
        System.out.println(values);

    }
}
