package Anand;

public class DeleteInArr {
    public static void main(String[] args) {
        int[] arr = {20,39,90,50,10,99};
        int[] temp = new int[arr.length-1];

        int indxToDel = 1;
        for (int i = 0; i < temp.length; i++) {
            if(i<indxToDel)
                temp[i] = arr[i];

            else
                temp[i] = arr[i+1];

            System.out.print(temp[i]+" ");
        }
    }
}
