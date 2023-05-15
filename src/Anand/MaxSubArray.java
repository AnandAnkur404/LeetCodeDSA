package Anand;

import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Sum");
        int maxSum = input.nextInt();
        int res = maxSubArr(arr, maxSum);
        System.out.println(res);

    }
    static int maxSubArr(int[] nums, int sum){
        int len = nums.length;
        int max = 999999;

        return 0;
    }
}