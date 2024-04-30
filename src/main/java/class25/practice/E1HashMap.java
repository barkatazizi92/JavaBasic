package class25.practice;

import java.util.HashMap;

public class E1HashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> groceryMap = new HashMap<>();
        groceryMap.put("Beans", 2);
        groceryMap.put("Rice", 2);
        groceryMap.put("Onion",4);
        groceryMap.put("Potato", 5);
        System.out.println(groceryMap);
        System.out.println(groceryMap.get("Rice"));
    }
}
