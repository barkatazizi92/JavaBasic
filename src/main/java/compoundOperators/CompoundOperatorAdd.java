package compoundOperators;


// compound operator are a short way to update the value of a variable
public class CompoundOperatorAdd {

    // how to add another number on the same variable?
    // create a variable and store 56 inside and then add 50 to that variable


    public static void main(String[] args) {

        int num = 56;

        // update the value and add 50 on
        num = num+50;
        // update and add 45 on
        num= num+45;

        // using of compound operator to update the value.
        // add 2 to the variable
        num +=2;
        num += 14;
        num +=3;

        System.out.println(num);
    }

}
