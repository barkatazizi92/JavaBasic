package compoundOperators;

/*
create a variable of money with value of 5
 */
public class CompoundOperatorsSubtract {

    public static void main(String[] args) {

        int money = 5;

        // add 500 to the money and subtract from 6, 8, 9.
        money = money + 250;
        money += 250;

        money -= 6;
        money -= 8;
        money -= 9;
        money -= 2;
        System.out.println(money);

    }
}
