package Recursion;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class FibonacciSeries {

//    Declaring global array large enough below
//    static int array[]=new int[1000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 10;
//        int n1=0;
//        int n2=1;
//        int n3;
//        System.out.print( n1 + " " + n2);
//        for (int i = 2; i < n; i++) {
//            n3 = n1 + n2;
//
//            System.out.print(" "+n3 + " ");
//            n1 = n2;
//            n2 = n3;
//        }


        System.out.println(fib(6));

    }
    static public int fib(int n){
        int n1=0;
        int n2=1;
        if (n == 0){
            return n1;
        }
        if (n == 1){
            return n2;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }

    }
}
