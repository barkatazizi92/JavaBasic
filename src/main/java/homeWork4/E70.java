package homeWork4;
/*
Write a program that creates an array of integers of size 11. Add the years 2010 to 2020 to
your array one by one using a for loop and then print all those values.
Example:
2010
2011
2012
2013
2014
2015
2016
2017
2018
2019
2020
 */
public class E70 {
    public static void main(String[] args) {
        int [] year = new int[10];
        year [0]= 2010;
        year [1] = 2011;
        year [2] = 2013;
        year [3] = 2014;
        year [4] = 2015;
        year [5] = 2016;
        year [6] = 2017;
        year [7] = 2018;
        year [8] = 2019;
        year [9] = 2020;
        for(int i = 0; i<10; i++){
            System.out.println(year[i]);
        }

    }
}
