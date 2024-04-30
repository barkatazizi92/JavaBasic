package class20.abstractPractice;

public abstract class Desk {

    public abstract void color();

    public abstract void size();
}

class MyDesk extends Desk{

    @Override
    public void color() {
        System.out.println("Desk color is white");
    }

    @Override
    public void size() {
        System.out.println(" Height is 34");
    }
}
class SecondDesk extends Desk{

    @Override
    public void color() {
        System.out.println("Desk color is black");
    }

    @Override
    public void size() {
        System.out.println("Height is 56");
    }
}
class DeskTester{
    public static void main(String[] args) {
        MyDesk myDesk = new MyDesk();
        myDesk.color();
        myDesk.color();
        System.out.println();
        SecondDesk secondDesk = new SecondDesk();
        secondDesk.color();
        secondDesk.size();
    }
}
