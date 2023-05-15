package WhileLoop;

import java.util.Scanner;

public class PrintInRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rem;
        int sum=0;
        int count=0;
        while (n>0){
            rem = n % 10;
            System.out.println(rem);
            sum = sum + rem;
            count++;

            n = n/10;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
