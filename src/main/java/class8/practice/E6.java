 package class8.practice;

/*
Create a 2D array (shorter way) in which first array will consist of 4 names
and second array will contain grades. Then your program should print name of the
Students that has A and B grade
 */
public class E6 {
    public static void main(String[] args) {
        int[] name = {10, 25, 45, 66, 85, 100};

     int calculate= 0;
   for (int i = 0; i<3; i++) {
       calculate = calculate + name[i];
   }
   System.out.println(calculate);
    }
}

