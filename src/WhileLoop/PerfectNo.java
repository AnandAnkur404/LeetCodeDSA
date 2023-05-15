package WhileLoop;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n/2){
            if(n%i == 0){
                sum = sum + i;
            }
            i++;
        }
        if(sum == n) {
            System.out.println("Entered number is perfect");
        }
        else {
            System.out.println("Not a perfect number");
        }


    }
}
