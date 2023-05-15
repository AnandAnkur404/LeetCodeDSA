package Anand;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

//        System.out.println(findSum(134));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n=input.nextInt();
        int count=0;
        for (int i=1;i<=n; i++){
            if(i == findSum(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\n"+count);


    }
    public static int countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static int findSum(int n){
        int digit=countDigit(n);
        int sum=0;
        int rem;
        while(n>0){
            rem=n%10;
            sum = sum + powerOfNum(rem, digit);
            n=n/10;
        }

        return sum;
    }
    public static int powerOfNum(int a, int b){
//        b = countDigit(a);
        int pow=1;
        for(int i=1; i<=b; i++){
            pow = pow*a;
        }
        return pow;
    }
}
