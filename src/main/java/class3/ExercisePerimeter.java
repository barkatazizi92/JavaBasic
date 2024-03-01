package class3;

/*
    Write a program to print the perimeter and area of a rectangle with width = 51 and height = 87.
     Output: The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __
     */
public class ExercisePerimeter {

    public static void main(String[] args) {

        int width = 51;
        int height = 87;
        int perimeter = 2*(width+height);
        int area = width*height;
        System.out.println("The perimeter of a rectangle with width " + width + " and height " +
                height+ " is equal to "+ perimeter+ " and the area equal to " + area);
    }
}
