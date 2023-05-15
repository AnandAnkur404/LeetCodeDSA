package Anand;

import java.util.Stack;

public class IntToBin {
    public static void main(String[] args) {
//        intToBin(25);
        intToBinUsingStack(5);

    }

//    static void intToBin(int n){
//
//        int bin;
//        while(n>0){
//            bin = n%2;
//            System.out.print(bin);
//            n=n/2;
//        }
//    }

    static void intToBinUsingStack(int n){
        Stack<Integer> s = new Stack<>();

        while (n>0){
            s.push(n%2);
            n = n/2;
        }
        System.out.println();
        while(!(s.isEmpty())){
            System.out.print(s.pop());
        }
    }
}
