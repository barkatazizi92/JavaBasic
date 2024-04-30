package class25;

import java.util.HashMap;

/*
Create a map of a building. Store floor number and its associated company name. (Example:
 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map

 */
public class BuildingMap {
    public static void main(String[] args) {

        HashMap<Integer, String> mapOfBuilding = new HashMap<>();
        mapOfBuilding.put(1,"Facebook");
        mapOfBuilding.put(2,"Instagram");
        mapOfBuilding.put(3,"X");
        mapOfBuilding.put(4,"TikTok");
        mapOfBuilding.put(5,"WhatsApp");
        mapOfBuilding.put(6,"Discord");
        mapOfBuilding.put(7,"Gmail");

        // duplicate
        mapOfBuilding.put(1,"Facebook");
        mapOfBuilding.put(2,"Instagram");
        mapOfBuilding.put(3,"X");
        mapOfBuilding.put(4,"TikTok");
        mapOfBuilding.put(5,"WhatsApp");
        mapOfBuilding.put(6,"Discord");
        mapOfBuilding.put(7,"Gmail");
// duplicate is not allow
        System.out.println(mapOfBuilding.size()+" size");
        mapOfBuilding.replace(4,"Google");
        System.out.println(mapOfBuilding);
        mapOfBuilding.remove(7);
        System.out.println(mapOfBuilding);
    }
}
