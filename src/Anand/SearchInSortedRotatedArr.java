package Anand;

public class SearchInSortedRotatedArr {
    public static void main(String[] args) {

        int[] arr = {22,33,44,55,66,77};
        int res = searchInArr(arr,4);
        System.out.println(res);
    }
    static int searchInArr(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int mid = s + (e - s) / 2;

        while (s <= e){
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target) {
                s = mid + 1;
                System.out.println("Infinite loop");
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
