package PatternPrinting;

public class PrintTriangle {
    public static void main(String[] args) {
        upperPyramid();
        rightAngled();
        leftRightAngled();
        int n=5;





        int n1=5;
        for (int i=0; i<n1; i++){
            for(int j=0; j<n1; j++){
                if(i+j <= n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<n1; i++){
            for(int j=0; j<n1; j++){
                if(i+j >= n-1){
                    System.out.print("* ");
                }
                else {
//                    one space less for upper pyramid
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//         pyramid

    }
    static void upperPyramid(){
        int n1=6;
        for (int i=0; i<n1; i++){
            for(int j=0; j<n1; j++){
                if(i+j >= n1-1){
                    System.out.print("* ");
                }
                else {
//                    one space less for upper pyramid
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void rightAngled(){
        int n=5;
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
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
    static void leftRightAngled(){
        int n1=5;
        for (int i=0; i<n1; i++){
            for(int j=0; j<n1; j++){
                if(i<=j){
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
