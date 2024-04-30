package class25;

import java.util.HashMap;

public class E1HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> makeUpMap = new HashMap<>();
        makeUpMap.put("BlushOn",20);
        makeUpMap.put("Lipstick", 50);
        makeUpMap.put("EyeLiner", 40);
        makeUpMap.put("Foundation", 100);

        System.out.println(makeUpMap.get("Lipstick"));
        System.out.println(makeUpMap.get("Foundation"));
        System.out.println(makeUpMap.size());
        System.out.println(makeUpMap.containsKey("BlushOn"));
        System.out.println(makeUpMap.containsValue(40));
        System.out.println(makeUpMap.isEmpty());

    }
}
