package barkatExercise;

public class E4NestedIf {
    public static void main(String[] args) {

        boolean mainDoor= true;
        boolean room1 = false;
        boolean room2 = true;
        if (mainDoor){
            System.out.println("Main door is open");
            if (room1){
                System.out.println("Room1 is open");
            }else
                System.out.println("Room1 is closed");
            if (room2){
                System.out.println("Room2 is open");
            }else
                System.out.println("Room2 is closed");
        }else {
            System.out.println("Main door is close");
        }
    }
}
