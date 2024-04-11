package homeWork5;
/*
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
Expected Output:
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */
public class Hw87Tester {
    public static void main(String[] args) {
        MainHw87 cars = new MainHw87();
        cars.car("Black",2019 ,"BMW");
        cars.car2("White", 2018,"Toyota");
        System.out.println(cars);
    }
}
