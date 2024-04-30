package class25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer,String> bestBuyStore = new HashMap<>();
        bestBuyStore.put(123,"Nokia");
        bestBuyStore.put(220, "Samsung");
        bestBuyStore.put(134,"Tv");
        bestBuyStore.put(5, "mouse");
        bestBuyStore.put(10, "Keyword");
//   first way
        bestBuyStore.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println();
//  another way
       Set<Map.Entry<Integer,String>> store =  bestBuyStore.entrySet();
        store.forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

        System.out.println();

//  second way to retrieve the key and value of Best Buy Store.
       var bestStore =  bestBuyStore.entrySet();
       bestStore.forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

        System.out.println();

//  third way: to retrieve the key and value of Best Buy Store.
        bestBuyStore.forEach((p,n)-> System.out.println(p+" "+n));
    }

}
