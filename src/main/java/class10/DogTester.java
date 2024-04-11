package class10;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="jimmi";
        dog.breed="German";
        dog.color="Black";
        dog.age=4;
        dog.weight=25;
        System.out.println(dog.name);
        System.out.println(dog.color);
        System.out.println(dog.breed);
        System.out.println(dog.age);
        dog.bark();

        Dog dog2 = new Dog();
        dog2.name="Jacky";
        dog2.color="White";
        dog2.breed="BullDog";
        dog2.age=10;
        dog2.weight=15;
        System.out.println(dog2.name);
        System.out.println(dog2.color);
        System.out.println(dog2.age);
    }
}
