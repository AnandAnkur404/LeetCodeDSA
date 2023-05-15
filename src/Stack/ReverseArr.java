package Stack;

import java.util.Stack;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 9, 90, 60};
        int[] arr2 = new int[arr.length];
        int j=arr.length-1;
        for(int i : arr)
        {  
            System.out.print(i+" ");
        }
        System.out.print("hello");
        System.out.println("besharam ");
        System.out.print("jhoomo ");
        for(int i =0;i<arr.length/2;i++)
        {

            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i : arr)
        {
            System.out.print(i+" ");
        }


    }
}

//        Stack<Integer> s = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            s.push(arr[i]);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//          int receive=s.pop();
//          if(receive%2==0)
//              System.out.print(receive+" ");
//        }
//    }
//}
