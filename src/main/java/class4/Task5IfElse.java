package class4;

public class Task5IfElse {

    public static void main(String[] args) {

        double mortgageRate = 6.6;
        int mortgatePrice = 20000;

        if (mortgageRate > 4.5) {
            System.out.println("User will not buy a house");

            if (mortgatePrice > 100000) {
                System.out.println("User will take a loan");
            } else {
                System.out.println("You will pay cash");
            }

        } else {
            System.out.println("User will consider buying");
        }
    }
}

