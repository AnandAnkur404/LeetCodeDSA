package Anand;

public class ArrReturn {
    public static void main(String[] args) {

    }

    public static int[] returnArr(int[] arr, int target){
        int[] res = new int[2];
        res[0] = 10;
        res[1] = 11;
        int i = res[0];
        int j = res[1];

        return new int[] {i, j};
    }
}
