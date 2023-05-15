package Anand;

public class SingleNumber {
    public static void main(String[] args) {
//        int[] arr = {4,1,2,1,2};
//        int res = 0;
//        for (int i=0; i<arr.length; i++){
//            res ^= arr[i];
//
//        }
//        System.out.println(res+" is the only single number present int the arr" );

//        single number2
        int[] arr = {5,5,6,7,7,6,2,4};
        int result = singleNo2(arr);
        System.out.println(result
        );
    }

    static int singleNo2(int[] arr){
        int res = 0;
        int ans;

        for (int i=0; i<arr.length; i++){
            res = res ^ arr[i];
        }
        int temp = res;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                temp = temp^res;
            }
        }

        ans=temp ^ res;
        return ans;
    }
}
