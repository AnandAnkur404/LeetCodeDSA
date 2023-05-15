package Anand;

public class Program12 {
    public static void main(String[] args) {
        int res = binaryNumber(11);
        System.out.println(res);
    }
    static int binaryNumber(int n){

        if(n==1 || n==0){
            return n;
        }
        return n%2 + 10 * binaryNumber(n/2);
    }
}
