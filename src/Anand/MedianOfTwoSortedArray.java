package Anand;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {

        int[] num1 = new int[3];
        int[] num2 = new int[4];
//        int res = medianOfSortedArr(num1[3], num2[4]);
    }

    static int medianOfSortedArr(int[] n1, int[] n2) {
        int med = 0;
        int len = n1.length + n2.length;
        int[] merge = new int[len];
        int k=0; int i = 0;
        int j = 0;
        while( true ){

            if(n1[i] > n2[j]){
                merge[k] = n1[i];
                i++;
            }
            else {
                merge[k] = n2[j];
                j++;
            }
            k++;
        }

//        return med;
    }



}
