import java.util.Arrays;

public class FreqOfEachEle {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 5, 5, 6, 6, 7, 7, 8, 7, 7};

//        Arrays.sort(arr);
//
        for(int i = 0;i<arr.length;i++)
        {
            int count =0;
            int ele = arr[i];
            for(int j =0;j<arr.length;j++)
            {
                if(arr[j]==ele)
                {
                    count++;
                    arr[j]=-1;
                }

            }
            if(ele!=-1)
                System.out.println(ele +"->"+count);

        }
    }
//
}
