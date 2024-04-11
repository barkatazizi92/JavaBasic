package class19.practice;

import class17.E;

class E1 {

    void car1() {
        System.out.println("Car1 is great");
    }
     void car2() {
         System.out.println("Car2 is create");
    }
}

class E2 extends E1 {
    @Override
    void car1() {
        System.out.println("Car 1 is very nice");
    }
}
class E1Tester {
    public static void main(String[] args) {
        E2 e2 = new E2();
        e2.car1();
        e2.car2();

    }
}
