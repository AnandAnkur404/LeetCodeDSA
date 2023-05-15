package Recursion;

public class SortedArray {
    public static void main(String[] args) {

        int[] arr = {2,4,5,6,66,333};
        int len = arr.length;
        boolean isSortedArr = sortedArr(arr, len);
        System.out.println(isSortedArr);
    }

    static boolean sortedArr(int[] arr, int index){

        if(index == 1 || index == 0){
            return true;
        }
        return arr[index-1] > arr[index-2] && sortedArr(arr, index-1);
    }
}
