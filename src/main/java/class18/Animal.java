package class18;
/*
when we do not creating constructor , the java will create for as one.
 if we have multiple inheritance class the java create default contractor
 for all of them and all the constructor are matching with each other.
  when we create our own contractor , our contractor should match
 in the all inheritance class as defualt constructor that java makes for as as a default .
 */
public class Animal {

   private String name;
   private String color;
   private int age;
   private double weight;

   public Animal(String name, String color,int age, double weight){
       this.name=name;
       this.color=color;
       this.age=age;
       this.weight=weight;
   }

   void printInfo(){
       System.out.println(name+" "+ color+" "+age+" "+weight);
   }
}

class Dog extends Animal{
    Dog(String name, String color, int age, double weight){
        super(name,color,age,weight);
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog d = new Dog("Mooo","White",34,34);
    }
}
