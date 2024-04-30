package class25;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E8 {
    public static void main(String[] args) {
        // create an arrayList of map
        ArrayList<LinkedHashMap<String, Integer>> list = new ArrayList<>();
        LinkedHashMap<String, Integer> fruit = new LinkedHashMap<>();
        fruit.put("Kiwi", 25);
        fruit.put("Apple", 10);
        fruit.put("Orange", 5);
        fruit.put("Banana", 30);

        LinkedHashMap<String, Integer> makeUpMap = new LinkedHashMap<>();
        makeUpMap.put("BlushOn", 20);
        makeUpMap.put("Lipstick", 50);
        makeUpMap.put("EyeLiner", 40);
        makeUpMap.put("Foundation", 100);
        makeUpMap.remove("BlushOn");

    }
}
