package class25.practice;

import java.util.HashMap;

public class E2HashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> groceryMap = new HashMap<>();
        groceryMap.put("Beans", 2);
        groceryMap.put("Rice", 2);
        groceryMap.put("Onion",4);
        groceryMap.put("Potato", 5);
        // remove method remove the item we specify
        groceryMap.remove("Beans");
        System.out.println(groceryMap);
        // replace method change the value
        groceryMap.replace("Onion", 45);
        System.out.println(groceryMap);
    }
}
