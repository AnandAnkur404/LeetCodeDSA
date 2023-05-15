package WhileLoop;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;
        int rem;
        while (n>0){
            rem = n%10;
            rev = rev* 10 + rem;
            n = n/10;
        }
        System.out.println(rev);
        if(n == rev){
            System.out.println("Yes PAlindrome");
        }
        else {
            System.out.println("Not PAlindrome");
        }
    }
}
