package Anand;

public class MargeSort {
    public static void main(String[] args) {
//        int[] arr = {2,3,11,33,9,1,31,10};
//        int n = arr.length;

        int n = 4;
        System.out.println(countPossNo(n));

    }
    static int countPossNo(int n){
        int dp[] = new int[n+1];
        int res = 0;
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        res = dp[n-1];
        return res;
    }

}
