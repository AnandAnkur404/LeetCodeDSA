package Anand;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArr {

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(new ArrayList[]{Intersect(arr1, arr2)}));
    }

    public static ArrayList<Integer> Intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> ai = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i+1; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]){
                    ai.add(nums1[i]);
                    break;
                }
            }
        }

        return ai;
    }
}
