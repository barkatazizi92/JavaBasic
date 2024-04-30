package class24.practice;

import java.util.HashSet;
import java.util.Set;

class HashSetTester extends HashSetPractice {
    HashSetTester(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Set<HashSetPractice> duplicate = new HashSet<>();
        duplicate.add(new HashSetPractice("Hamid", 23));
        duplicate.add(new HashSetPractice("Jan", 34));
        duplicate.add(new HashSetPractice("Jan", 34));
        for (HashSetPractice hash : duplicate) {
            System.out.println(hash.getAge() + " " + hash.getName());
        }
    }
}
