package class24.practice;

import java.util.HashSet;
import java.util.Set;

/*
Set:
   1) They don't allow duplicates.
   2) They don't store the data based on index.
HashSet:
   Upside:
       It's Fast.
   Downside:
       It does not remember the insertion order.
*/
public class E2Hashset {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("Hamid");
        name.add("Hamid");
        name.add("John");
        name.add("John");
        name.forEach(x-> System.out.println(x));

    }
}
