package Anand;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,0,0,0};
        int[] arr2= {2,5,6};
        int n = arr1.length;
        int m = arr2.length;
        int i=0;
        int j=0;
        int k=0;
        int len = n + m;
        int[] temp = new int[len];
//        i and j is the pointer of the both array will iterate through the length of the array and check every ele

        while (i < n && j < m ) {
            if(arr1[i] <= arr2[j]) {

                if(arr1[i] == 0){
                    i++;
                }
                else {
                    temp[k] = arr1[i];
                    i++;
                }


            }
            else {
                temp[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (j < m) {
            temp[k] = arr2[j];
            k++;
            j++;
        }
        while (i < n) {
            temp[k] = arr1[i];
            k++;
            i++;
        }
        for (int l = 0; l < len; l++) {
            arr1[l] = temp[l];
        }

//        Arrays.sort(temp);
//        if(temp.length%2!=0)
//        {
//            System.out.println("\nmedian is "+ temp[temp.length/2 ]);
//        }
//        else
//
//        {
//            double avg = (temp[temp.length/2 -1]  + temp[temp.length/2])/2;
//            System.out.println("\n median is "+ avg);
//        }
    }
}
