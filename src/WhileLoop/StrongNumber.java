package WhileLoop;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int sum = 0;
        int fact=1;
        int rem;
        while (i<=n){
            rem = n % 10;
//            fact = fact * rem;
        }
        if(n == sum){
            System.out.println("Entered number is strong number");
        }
        else {
            System.out.println("Not a strong number");
        }
    }
}
