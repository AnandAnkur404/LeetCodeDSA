package Anand;

public class PrintPairEleFromArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        pairPrint(arr);
    }
    static void pairPrint(int[] arr){

        for (int i=0; i<arr.length; i++){

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i]);

                System.out.print(arr[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
