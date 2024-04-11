package class19;

public class Animal {
    void sleep() {
        System.out.println("Animal is sleep");
    }
    void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {
    @Override
    void sleep() {
        System.out.println("Dog like to sleep 6 to 8 hours");
    }
}

class AnimalTester {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
        d.eat();

    }
}
