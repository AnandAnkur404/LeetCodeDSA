package BitManipulationQues;

public class SingleNumber {

    public static void main(String[] args) {
/*
* using xor operator
* we will get a number
* which is present only once in an array
* This algorithm works on the XOR
* By performing XOR on any number with 0 it will give that number only
* a ^ 0 = a
* and performing XOR on number with the same number will give 0 as a result
* a ^ a = 0
*/
        int[] arr = {4,1,2,1,2};
        int res = 0;
        for (int i=0; i<arr.length; i++){
            res ^= arr[i];

        }
        System.out.println(res+" is the only single number present int the arr" );
        }
}
