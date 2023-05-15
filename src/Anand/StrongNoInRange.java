package Anand;

import java.util.Scanner;

public class StrongNoInRange {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int count=0;
//        for (int i = 0; i < n; i++) {
//            if(i==strongNo(i)){
//                System.out.print("Strong no:  "+ i);
//                System.out.println();
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(strongNo(145));
    }
    static int strongNo(int n ){
        int fact=1;
        int sum=0;
        while (n>0){
            int rem=n%10;

            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }

            sum=sum+fact;
            n=n/10;
        }
        return sum;
    }
}
