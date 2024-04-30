package class24;
/*
Create a Cat class create 3 fields a constructor  and printInfo method inside it.
Create three objects from this class store them inside the
 Linked list and call printInfo method using these three objects.
 */

import java.util.LinkedList;

public class Cat {

    String name;
    String color;
    int age;

    public void printInfo() {
        System.out.println(name + color + age);
    }

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        Cat cat1 = new Cat("Mim "," White ",3);
        Cat cat2 = new Cat("Wiw "," brown ",4);
        Cat cat3 = new Cat("Tit "," black ",5);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        for(Cat cat : cats){
            cat.printInfo();

        }
    }
    /*
    public class CatLinkedList {
    public static void main(String[] args) {

        LinkedList<Cat> cats = new LinkedList<>();
        Cat cat1 = new Cat("Nikola", "Dirty blonde", 100);
        Cat cat2 = new Cat("Asghar", "Grey", 10);
        Cat cat3 = new Cat("Ana", "Off white", 15);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (Cat cat : cats) {
            cat.printInfo();
        }
    }
}
public class Cat {
    private String name;
    private String color;
    private int age;

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

   public void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}
     */

}
