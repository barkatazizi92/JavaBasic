package class3;

public class PerimeterOfRectangle {

    /*
    Write a program to print the perimeter and area of a rectangle with width = 5 and height = 8.
     Output: The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __
     */
    public static void main(String[] args) {

        int width = 5;
        int height = 8;
        int perimeter = 2*(width+height);
        int area = (width*height);
        System.out.println("The perimeter of a rectangle with width "+width+ " and height "
                + height+ " is equal to "+ perimeter+ " and the area equals to "+ area);

    }
}
