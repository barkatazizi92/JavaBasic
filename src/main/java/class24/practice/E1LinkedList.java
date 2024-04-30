package class24.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
LinkedHashSet:
    Upside:
        it remembers the order.
    Downside:
        It's a little slower than the HashSet.
 */
public class E1LinkedList {

    public static void main(String[] args) {
        Set<String> name = new LinkedHashSet<>();
        name.add("John");
        name.add("Latifa");
        name.add("Latifa");
        name.add("John");
        name.add("Fahim");
        System.out.println(name);
    }
}
