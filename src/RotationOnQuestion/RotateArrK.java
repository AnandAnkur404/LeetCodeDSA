package RotationOnQuestion;

public class RotateArrK {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8};
        int k = 2;
        int n = arr.length;
        int[] temp = new int[n];
        for (int i=0; i<n; i++){
            temp[(i+k)%n] = arr[i];
        }
        for (int i=0; i<n; i++){
            System.out.print(temp[i] + " ");
        }
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
//        this for loop is used to return the main arr element after rotating the main arr
        System.out.println();
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
