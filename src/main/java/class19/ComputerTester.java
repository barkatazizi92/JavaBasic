package class19;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] arr = {new Apple(), new Dell(), new HP(), new Lenovo()};

        for (int i = 0; i< arr.length; i++){
          Computer c =  arr[i];
          c.color();
          c.price();
          c.quality();
            System.out.println();
        }
    }
}
