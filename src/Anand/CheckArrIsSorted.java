package Anand;

public class CheckArrIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,9};
        System.out.println(sortedArr(arr, 0));
    }
    static boolean sortedArr(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sortedArr(arr, index+1);
    }
}
