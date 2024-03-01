package task1;

public class PracticeVariables {

    public static void main(String [] args){

       // in your program create 8 variable to store all different type of primitive data

        byte threeNumber = 127;
        short monthlyRent = 1700;
        int phoneNumber = 2023445566;
        long distanceOfTheMoon = 343454556656577675L;
        char barkat = 'B';
        Boolean isSunny = true;
        boolean isNotSunny = false;
        float cakePrice = 2.90f;
        double darkChocolate = 5.99;

        System.out.println("We can not store more than " +threeNumber);
        System.out.println("My monthly rent is " + monthlyRent+"$");
        System.out.println("This is my phoneNUmber = " +phoneNumber);
        System.out.println("This is the distance of the earth to the moon = "+distanceOfTheMoon);
        System.out.println("My first letter of my name is " +barkat);
        System.out.println("Today is sunny "+isSunny);
        System.out.println("Today is not sunny " + isNotSunny);
        System.out.println("This is the price of the cake = "+cakePrice);
        System.out.println("This is the price of the dark chocolate = " +darkChocolate);

        //update the all value of the variable we created on the above
        threeNumber = 126;
        monthlyRent = 1800;
        phoneNumber = 2023456789;
        distanceOfTheMoon = 2334445556L;
        barkat = 'A';
        isSunny = false;
        isNotSunny = true;
        cakePrice = 2.99f;
        darkChocolate = 6.99;

        System.out.println(threeNumber);
        System.out.println(monthlyRent);
        System.out.println(phoneNumber);
        System.out.println(distanceOfTheMoon);
        System.out.println(barkat);
        System.out.println(isSunny);
        System.out.println(isNotSunny);
        System.out.println(cakePrice);
        System.out.println(darkChocolate);

   }
}
