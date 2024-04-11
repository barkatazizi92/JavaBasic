package class19.practice;

public class FinalKeyword {

     void car(){
        System.out.println("I want to buy a car in october");
    }

    void car1(){
        System.out.println("I will buy a cheap car");
    }
}
class Keyword1 extends FinalKeyword{
    @Override
    void car(){
        System.out.println("my budget is 5000");
    }

    final int a = 3;
}

final class Keyword2 extends Keyword1 {
    public static void main(String[] args) {
        Keyword1 keyword1 = new Keyword1();
        keyword1.car();
        System.out.println(keyword1.a);
    }
}


