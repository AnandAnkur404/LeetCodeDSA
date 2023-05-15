package Anand;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int rem;
        int rev = 0;
        while (n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);

//        do{
//            rem = n%10;
//            rev = rev*10 + rem;
//        }
    }
}
