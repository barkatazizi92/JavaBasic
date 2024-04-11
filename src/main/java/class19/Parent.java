package class19;

public class Parent {
    void marry(){
        System.out.println("Marry the girl we chose for you");
    }
}

class Alex extends Parent{
    void marry(){
        System.out.println("I will marry 100 time with my wife");
    }
}

class parentTester{
    public static void main(String[] args) {
       Alex a = new Alex();
       a.marry();
    }
}
