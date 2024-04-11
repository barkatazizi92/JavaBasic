package class12.TaskHomeWork;
/*
how would you swap 2 String without a temporary variable.
swap the value of car to motorcycle.
 */
public class SwapExercise {

    public static void main(String[] args) {
        String car = "Toyota";
        String motorcycle ="Honda";
        System.out.println("Car name = " +car );
        System.out.println("Motorcycle name = " +motorcycle );

        System.out.println(); // no need to write this , it is just for space

        // now i swap the car to honda and the motorcycle to toyota.
        String emptyBox=""; // create an empty box to hold the value of car= toyota
        emptyBox=car;    // moved toyota inside the empty box and now car is empty
        car=motorcycle; // moved Honda inside the car box which was empty.
        motorcycle=emptyBox; // moved the car value which i stored inside empty box to motorcycle box.
        System.out.println("Car name = "+car);
        System.out.println("Motorcycle name = " +motorcycle);
    }
}
