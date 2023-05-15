package Anand;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};

        int res = binarySearch(arr, 2);
        System.out.println(res);
    }

    public static int binarySearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e-s)/2;
        while(s<=e){

            if(arr[mid] == key) {
                return mid;
            }

            else if(arr[mid] < key) {
                s = mid + 1;

            }
            else {
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return -1;
    }
}
