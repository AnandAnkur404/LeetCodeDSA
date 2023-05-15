package Anand;

public class MissingNum {
    public static void main(String[] args) {
       int[] arr = {11,12,13,15,16,17};
       int res = missingNumFromRange(arr);
       System.out.println(res);
    }
    static int missingNum(int[] arr){
        int n = arr.length;
        int sum1 = n * (n+ 1)/2;
        int sum=0;
        for (int i=0; i<n; i++){
            sum += arr[i];
        }


        return sum1-sum;
    }
    static int missingNumFromRange(int[] a){
        int n = a.length;
        int sum1 = n/2 * ( a[0] + a[a.length-1]);
        int sum2=0;
        for (int i = 0; i < n; i++) {
            sum2 = sum2 + a[i];
        }
        int diff = sum1-sum2;
        return diff;
    }
}
