package Anand;

public class SearchInsertIndx {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};

        int res = searchInsertPos(arr, 9);
        System.out.println(res);


    }
    static int searchInsertPos(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e - s)/2;

        while(s <= e) {
            if (arr[mid] == target) {
                return mid;
            }

            else if (target > arr[mid]) {
                s = mid + 1;
            }
            else if (target < arr[mid]) {
                e = mid - 1;
            }
            mid = s + (e - s)/2;
        }
        return e+1;
    }
}
