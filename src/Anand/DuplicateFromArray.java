package Anand;

public class DuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,4,5,6,7,8};
        int len = arr.length;
        int[] temp = new int[len-1];
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len-1; j++) {
                if (arr[i] == arr[i+1]){

                    temp[j] = arr[i];
                }
            }

        }
        for (int i=0;i<len;i++){
            System.out.println(temp[i]+ " ");
        }

    }
}
