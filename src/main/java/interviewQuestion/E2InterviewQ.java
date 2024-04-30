package interviewQuestion;

import java.util.Scanner;
public class E2InterviewQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();
       String result = str.substring(start,end);
        System.out.println(result);

    }
}
