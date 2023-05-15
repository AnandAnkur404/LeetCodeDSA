package PatternPrinting;

public class PrintMatrix {
    public static void main(String[] args) {
        int n=5;

        printXPattern();
        downwardPyramid();
        printRightTriangle();
//        upwardPyramid();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
    static void printXPattern(){
        int n=5;
//        output
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>=i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void downwardPyramid(){
        int n=5;
//        output
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>=i){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void printRightTriangle(){
        int n=5;
//        output
//*
//* *
//* * *
//* * * *
//* * * * *

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
