package class25.practice;

import java.util.LinkedHashMap;

public class E3LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> groceryMap = new LinkedHashMap<>();
        groceryMap.put("Beans", 2);
        groceryMap.put("Rice", 2);
        groceryMap.put("Onion",4);
        groceryMap.put("Potato", 5);

        // clear method remove everything
        groceryMap.clear();
        System.out.println(groceryMap);
    }
}
