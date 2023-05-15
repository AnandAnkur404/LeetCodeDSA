package Anand;

public class FrequencyOfEachEle {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,4,3,1,2};
        freqOfEleInArr(arr);
    }
    static void freqOfEleInArr(int[] arr){
        boolean[] res = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            if(res[i] != true){

                for(int j=i+1; j < arr.length; j++) {

                    if(arr[i] == arr[j]) {
                        count++;
                        res[j] = true;
                    }
                }
                System.out.println(arr[i] + "--->"+ count);
            }

        }
    }
}
