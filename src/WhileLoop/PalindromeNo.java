package WhileLoop;

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;
        int rem;
        while (n>0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(n == rev){
            System.out.println("Entered no is palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
