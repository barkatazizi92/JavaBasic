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
public class HashSetPractice {
    private String name;
    private int age;

    HashSetPractice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

