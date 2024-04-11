package class14;

public class CatTester {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="Meue";
        cat.color="white";
        cat.age=2;
        cat.catName();
        System.out.println();

        cat.catInfo();/// shortcut way that i can print the value of cat
        System.out.println();

        System.out.println(cat.name);
        System.out.println(cat.color);
        System.out.println(cat.age);
    }
}
