package Anand;

public class ReverseArr {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        revArr(a);
    }
    static int[] revArr(int[] arr){
        int[] temp = new int[arr.length];
        for (int i= arr.length-1; i>=0; --i){
            System.out.print(temp[i]);
        }
        System.out.println();
        return temp;
    }
}
