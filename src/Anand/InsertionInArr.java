package Anand;

public class InsertionInArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,5};
        int[] temp = new int[arr.length+1];

        int key = 100 ;
        for (int i = 0; i < temp.length; i++) {
            if(i<2){
                temp[i] = arr[i];
            }
            else if (i == 2) {
                temp[i] = key;
            }

            else {
                temp[i] = arr[i-1];
            }
            System.out.print(temp[i]+" ");
        }
   }
}

