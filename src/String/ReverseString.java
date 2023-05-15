package String;

public class ReverseString {
    public static void main(String[] args) {

        String[] str = {"H","a","n","n","a","h"};

    }
    public static void revString(char[] c){
        int start = 0;
        int end = c.length-1;
        while (start < end){

            char temp = c[start];
            c[start] = c[end];
            start++;
            c[end] = temp;
            end--;
        }
    }
}
