package Anand;

public class AvgTemp {
    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 90};
        int count=0;
        int avgSum = avgTemp(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avgSum){
                count++;
            }

        }
        System.out.println(count+" days have higher average temperature "+"average temp is "+ avgSum);
    }
    static int avgTemp(int[] arr){

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avSum = sum / arr.length;
        return avSum;
    }
}
