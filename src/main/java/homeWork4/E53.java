package homeWork4;
/*
Using do while loop print even numbers from 20 to 1
Output:
20
18
16
14
12
10
8
6
4
2
*/
public class E53 {
    public static void main(String[] args) {
        int i =20;
        do{
            System.out.println(i);
            i=i-2;
        }while(i>0);
    }
}
