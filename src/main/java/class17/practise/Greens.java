package class17.practise;

public class Greens {

    private String name;
    private int price;
    private int weight;

    Greens(String name, int price,int weight){
        this.name= name;
        this.price= price;
        this. weight= weight;
    }
    public void printInfo(){
        System.out.println(name+ " "+ price+ " "+ weight);
    }
}
class GreenOnion extends Greens{
    GreenOnion(String name, int price , int weight){
        super(name,price,weight);
    }
}
class GreenTester{
    public static void main(String[] args) {
        GreenOnion greenOnion = new GreenOnion("Carrot",2, 1);
        greenOnion.printInfo();
    }
}
