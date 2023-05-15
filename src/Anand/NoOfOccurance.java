package Anand;

//import java.util.ArrayList;

public class NoOfOccurance {
    public static void main(String[] args) {

    }

    static void noOfOccurance(int[] arr){

        int a = -1;
        int max = Integer.MIN_VALUE;
        boolean[] res = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){

            int count=1;
            if(!res[i]){

                for(int j=i+1;i< arr.length; i++){

                    if(arr[i] == arr[j] ){
                        count++;
                        res[j] = true;

                    }
                }
            }
            if(count>max){


            }

        }

    }

}
