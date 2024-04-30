package class21;



public interface Human {
    void walk();
}
interface Person extends Human{
    void speak();
}
interface Employee extends Person{
    void work();
}

class SyntaxEmployee implements Employee{

    @Override
    public void walk() {
        System.out.println("Walking ");
    }

    @Override
    public void speak() {
        System.out.println("Speaking");
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}


