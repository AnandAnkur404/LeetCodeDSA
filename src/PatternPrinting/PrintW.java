package PatternPrinting;

public class PrintW {
    public static void main(String[] args) {
//        int n=5;
//        printE();
//        printF();
//        printH();
//        printI();
        printJ();
//        for(int i=0; i<n; i++){
//            for(int j=0;j<n; j++){
//                if (i==j && i>=n/2 || i+j==n-1 && j<=n/2 || j==0 || j==n-1){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        System.out.println();
    }
    static void printE(){
        int n=5;
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if (j==0 || i==0 || i==n/2 ||  i==n-1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printF(){
        int n=5;
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if ( j==0 || i==0 || i==n/2 || j==0 && i==n-1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printH(){
        int n=5;
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if ( j==0 || i==n/2 || j==n-1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printI(){
        int n=5;
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if ( j==n/2 || i==0 || i==n-1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printJ(){
        int n=5;
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if ( i==0 || j==n-1 || i==n-1 && j >= n/2 ||j==n/2  ){
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
