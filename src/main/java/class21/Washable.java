package class21;

public interface Washable {

    void wash();
}

class Dog implements Washable{

    @Override
    public void wash() {
        System.out.println("You can wash a dog");
    }
}
class Sofa implements Washable{

    @Override
    public void wash() {
        System.out.println("You can wash sofa as well");
    }
}

