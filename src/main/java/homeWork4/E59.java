package homeWork4;

import com.sun.source.tree.EnhancedForLoopTree;

/*
Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019. Must include year 2019 in the output

Output:

Hey, it is year:
2011
Hey, it is year:
2012
Hey, it is year:
2013
Hey, it is year:
2014
Hey, it is year:
2015
Hey, it is year:
2016
Hey, it is year:
2017
Hey, it is year:
2018
Hey, it is year:
2019
 */
public class E59 {
    public static void main(String[] args) {
        String year = "Hey, It is year:";
        for(int index = 2011; index <=2019; index++){
            System.out.println(year);
            System.out.println(index);
        }


    }
}

