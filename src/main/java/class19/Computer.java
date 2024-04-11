package class19;

public class Computer {
    void color() {
        System.out.println("4 colors");
    }

    void price() {
        System.out.println(1000);
    }

    void quality() {
        System.out.println("Good Quality");
    }
}

class Apple extends Computer {
    @Override
    void price() {
        System.out.println(3300 + "$");
    }
}

class Lenovo extends Computer {
    @Override
    void quality() {
        System.out.println("the quality is ok");
    }
}

class HP extends Computer {
    @Override
    void color() {
        System.out.println("Have 5 color");
    }
}

class Dell extends Computer {
    @Override
    void price() {
        System.out.println(800);
    }
}

