package class25.practice;

import java.util.Collection;
import java.util.TreeMap;

public class RemoveIf {

    public static void main(String[] args) {
        TreeMap<String, Double> fruit = new TreeMap();
        fruit.put("Kiwi", 5.5);
        fruit.put("Apple", 10.5);
        fruit.put("Orange", 5.5);
        fruit.put("Banana", 30.5);

        /*
         removeIf is not available inside the map that is way we need to store it inside a collection class
         and then call removeIf method from there.
         */
        Collection<Double> f = fruit.values();
        System.out.println(f);
        f.removeIf(x->x>5.5);
        System.out.println(f);

    }
}
