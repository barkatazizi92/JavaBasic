package class19;
/*
Create a class CreditCard Create an instance method that will calculate interest based on the
 given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes
 */
public class CreditCard {

    void calculateInterest( double balance){
        System.out.println(balance *.05);

    }
}
class Visa extends CreditCard{

}
class Ax extends Visa {
    @Override
    void calculateInterest(double balance) {
        System.out.println(balance*0.5);
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        Visa v = new Visa();
        Ax ax = new Ax();
        ax.calculateInterest(5000);
        c.calculateInterest(1000);
        v.calculateInterest(3000);
    }

}


