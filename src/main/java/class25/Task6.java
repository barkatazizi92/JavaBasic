package class25;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class Task6 {
    public static void main(String[] args) {
        Set<String> word = new TreeSet<>();
        word.add("Pen");
        word.add("Pencil");
        word.add("Book");
        word.add("Computer");

        String name = "";
        for (String n : word) {
            name = name +" "+ n;
        }
        System.out.println(name);
    }
}

