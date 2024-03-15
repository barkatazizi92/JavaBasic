package barkatExercise;
/*
write a program to print the area and perimeter of a rectangle with width = 5 and height = 8.
your program should say, " The perimeter of a rectangle with width __ and height __ is equal to __
and the area is __"
 */
public class Task2AreaPerimeter {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = (width*height);
        int perimeter =2* (width+height);
        System.out.println("The perimeter of a rectangle with " +width+ " And "
        + height+" is equal to "+ perimeter+" and the area is "+ area );

    }
}
