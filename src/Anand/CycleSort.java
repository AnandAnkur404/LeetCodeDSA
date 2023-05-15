package Anand;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 2, 3, 1};
        cycleSort(arr);
    }

    static void cycleSort(int[] arr){

        int i=0;
        while (i<arr.length){
            int correct = arr[i] -  1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{

                i++;
            }
        }


        System.out.print(Arrays.toString(arr));

    }

     static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
