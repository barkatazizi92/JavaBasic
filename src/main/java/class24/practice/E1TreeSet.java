package class24.practice;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet:
    Upside:
        It keeps the data sorted.
    Downside:
        Insertion is very, very slow.
 */
public class E1TreeSet {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Baqir");
        names.add("Baqir");
        names.add("Aman");
        names.add("Hamid");
        names.add("Hamid");
        names.add("sop");
        names.add("Barkat");
        names.add("Barkat");
        System.out.println(names);
    }
}
