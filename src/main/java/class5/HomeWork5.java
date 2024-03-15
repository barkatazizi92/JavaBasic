package class5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
* Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season ______”.*/
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String birthSeason = scan.nextLine();

        switch(birthSeason){
            case"December":
            case"January":
            case"February":
                System.out.println("You were born is season Winter");
                break;
            case"March":
            case"April":
            case"May":
                System.out.println("You were born is season Spring");
                break;
            case"June":
            case"july":
            case"August":
                System.out.println("You were born is season Summer");
                break;
            case"September":
            case"October":
            case"November":
                System.out.println("You were born is season Fall");
                break;
        }


    }
}
