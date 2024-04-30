package class21;

public class WashableTester {
    public static void main(String[] args) {
        Washable [] wash = {new Dog(),new Sofa()};
        for (Washable washable: wash){
            washable.wash();
        }
    }
}
