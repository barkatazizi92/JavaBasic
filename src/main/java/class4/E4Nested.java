package class4;

public class E4Nested {

    public static void main(String[] args) {

        boolean mainDoor = true;
        boolean room1 = true;
        boolean room2 = false;

        if (mainDoor) {

            if (room1) {
                System.out.println("Room1 is open");
            } else {
                System.out.println("Room1 is closed");
            }

        } else {
            System.out.println("Main door is closed");
        }
    }
}
