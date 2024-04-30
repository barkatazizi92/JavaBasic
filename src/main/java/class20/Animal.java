package class20;

public abstract class Animal {

    public abstract void sleep();


    public abstract void eas();

    public abstract void speak();
}

class Dog extends Animal {
    @Override
    public void sleep() {
        System.out.println("Sleep well");
    }

    @Override
    public void eas() {
        System.out.println("Eat well");
    }

    @Override
    public void speak() {
        System.out.println("no one can understand");
    }
}
/*
package org.example.class20;

public abstract class Animal {

    private String name;
    private String color;
    private int age;

    Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    public abstract void sleep();
    public void eat(){
        System.out.println("Eating...............");
    }
    public void speak(){
        System.out.println("Eating..........");
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Dog extends Animal{


    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZzzzzZZZ");
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat Meat");
    }

    @Override
    public void speak() {
        System.out.println("Wuff Wuff");
    }


}
class Cat extends Animal{

    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZzzzz.zzz");
    }

}
 */
