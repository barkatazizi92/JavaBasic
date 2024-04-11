package homeWork4;
/*
Write a program that uses for loop to prints multiplication of number 3 from 1 to 10
Output:
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
3*10=30
 */
public class E61 {
    public static void main(String[] args) {

        int number=3;
        int table=10;
        for(int i = 1; i<= table; i++){
            int result= number * i;
            System.out.println(number+"*"+i+"="+result);
        }

        }
    }

