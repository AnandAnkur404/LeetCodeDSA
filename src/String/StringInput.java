package String;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        sc.nextLine();
        String [] arr = new String[size];
        arr[0]=sc.nextLine()
                ;
        arr[2]=sc.nextLine();

        for(String s: arr)
        {
            System.out.println(s);
        }



    }
}
