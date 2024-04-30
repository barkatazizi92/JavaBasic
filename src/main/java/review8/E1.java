package review8;

import java.util.ArrayList;

public class E1 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Dog");
        words.add("Home");
        words.removeIf(c->c.endsWith("e"));
        System.out.print(words);
    }
}
