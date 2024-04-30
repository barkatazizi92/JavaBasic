package class21;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
 and calculatePerimeter. Create 2 classes Circle & Square that implements
  functionality defined in the Shape Interface. Test your code.
 */
public interface Shape {
    void calculateArea(double a);

    void calculatePerimeter(double a);
}

class Circle implements Shape {

    @Override
    public void calculateArea(double a) {
        System.out.println(Math.PI*(a*a));
    }
    @Override
    public void calculatePerimeter(double a) {
        System.out.println(Math.PI*a);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println(a*a);
    }

    @Override
    public void calculatePerimeter(double a) {
        System.out.println(4*a);
    }
}


