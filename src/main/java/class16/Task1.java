package class16;

/*
Write a java class that will have a constructor: one with parameters and second without any parameters.
 Create a separate Test class where you will execute both of the constructors 1 by 1.

 */
public class Task1 {
    private String learn;

    public Task1(String iLearn) {
        learn = iLearn;
    }

    public Task1() {
    }

    void printName() {
        System.out.println(learn);
    }
}
