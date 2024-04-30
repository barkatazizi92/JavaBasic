package class25.practice;

import class3.Lessthen;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class E2LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> groceryMap = new LinkedHashMap<>();
        groceryMap.put("Beans", 2);
        groceryMap.put("Rice", 2);
        groceryMap.put("Onion",4);
        groceryMap.put("Potato", 5);
        // remove method remove the item we specify
        groceryMap.remove("Beans");
        System.out.println(groceryMap);
        // put back the beans after removed.
        groceryMap.put("Beans", 3);

        // replace method change the value
        groceryMap.replace("Onion", 45);
        System.out.println(groceryMap);

        // clear method remove everything
        groceryMap.clear();
        System.out.println(groceryMap);
    }
}
