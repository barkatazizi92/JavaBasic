package homeWork5;
/* Create a Class Main In this class, you should specify the following attributes:
 breed, name, color, and following behaviors: bark(), run(), play(). Create 3 different objects of it:
 Husky, Bulldog, Labrador with specific attributes and behaviors.
Expected Output:
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play */
public class Hw88Tester {
    public static void main(String[] args) {
        MainHw88 dog = new MainHw88();
        dog.animal("","Husky ", "White");
        dog.animal("", "Bulldog", "Black");
        dog.animal("", "Labrador", "Brown");
        System.out.println(dog);

    }
}
