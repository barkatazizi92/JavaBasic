package class25;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class E2HashMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> makeUpMap = new LinkedHashMap<>();
        makeUpMap.put("BlushOn", 20);
        makeUpMap.put("Lipstick", 50);
        makeUpMap.put("EyeLiner", 40);
        makeUpMap.put("Foundation", 100);
        makeUpMap.remove("BlushOn");
        System.out.println(makeUpMap);
        makeUpMap.replace("EyeLiner", 50);
        System.out.println(makeUpMap);
    }
}
