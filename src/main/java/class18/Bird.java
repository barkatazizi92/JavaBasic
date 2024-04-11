package class18;
/*
Create a Bird class create 4 fields and use the Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make  fields private and define printInfo
 methods as well create the object of each class and call the methods
 */
public class Bird {
   private String name;
   private String color;
   private int age;
   private int weight;

   public Bird(String name,String color,int age, int weight){
       this.name=name;
       this.color=color;
       this.age=age;
       this.weight=weight;
   }
   public void printInfo(){
       System.out.println(name+" "+ color+ " "+ age+" "+weight);
   }

}
class Sparrow extends Bird{
    public Sparrow(String name, String color, int age, int weight){
        super(name,color,age,weight);
    }

}
class Parrot extends Sparrow{
    public Parrot(String name, String color,int age, int weight){
        super(name,color,age,weight);
    }
}
 class BirdTester {

    public static void main(String[] args) {
        Parrot parrot = new Parrot("Parrot", "White",4,4);
        parrot.printInfo();
    }
}


