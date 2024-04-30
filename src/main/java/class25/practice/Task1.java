package class25.practice;
/* Create a map of a building. Store floor number and its associated company name. (Example:
 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String> buildingMap = new HashMap<>();
        buildingMap.put(1,"My office");
        buildingMap.put(2,"My employe office");
        buildingMap.put(3,"H4 office");
        buildingMap.put(4, "Sir office");
        buildingMap.put(5,"IT office");
        buildingMap.put(6,"Electricity office");
        buildingMap.put(7, "Kitchen");

        buildingMap.put(1,"My office");
        buildingMap.put(2,"My employe office");
        buildingMap.put(3,"H4 office");
        buildingMap.put(4,"Sir office");
        buildingMap.put(5,"IT office");
        buildingMap.put(6,"Electricity office");
        buildingMap.put(7,"Kitchen");
        System.out.println(buildingMap.size());
        System.out.println(buildingMap.replace(4, "Supply office"));
        System.out.println(buildingMap.remove(7));
        System.out.println(buildingMap);
    }
}
