package PatternPrinting;

public class AlphabetPattern {
    public static void main(String[] args) {
        int n=5;
//        printing F
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if( i==0 || j==0 || i==n/2 || j==n ){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
