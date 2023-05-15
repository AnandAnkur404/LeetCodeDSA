package Anand;

public class MinMaxInArr {
    public static void main(String[] args) {
        int[] arr = {2, 31, 4,89,34,51};
        int n = arr.length;
        int res =maxInArr(arr);
        System.out.println(res);
    }

    static int maxInArr(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int max2nd = -1;
        for (int i =0;i< arr.length;i++) {
            if (arr[i] > maxSoFar) {
                maxSoFar = arr[i];
            }


        }
        for (int i=0;i< arr.length;i++) {
            if (arr[i] > max2nd && arr[i] < maxSoFar) {
                max2nd = arr[i];
            }
        }
        System.out.println(max2nd);
        return maxSoFar;

    }

}