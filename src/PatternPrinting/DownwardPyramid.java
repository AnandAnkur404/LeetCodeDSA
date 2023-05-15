package PatternPrinting;

public class DownwardPyramid {
    public static void main(String[] args) {
        int n=6;
        int k=11;
        for(int i=0;i<n;i++){
//            int k = 1;
            for (int j=0; j<n; j++){
                if(i>=j){
//                    System.out.print(k++%2+" ");
//                    output =>
//                    1
//                    1 0
//                    1 0 1
//                    1 0 1 0
//                    1 0 1 0 1
//                    1 0 1 0 1 0

//                    System.out.print(k++ +" ");
//                    if k =1 before inner loop
//                    1
//                    1 2
//                    1 2 3
//                    1 2 3 4
//                    1 2 3 4 5
//                    1 2 3 4 5 6
                    System.out.print(k++ +" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
