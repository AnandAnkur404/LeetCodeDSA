package Recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int res = decimalToBinary(10);
        System.out.println(res);
    }
    static int decimalToBinary(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n%2+10*decimalToBinary(n/2);
    }
}
