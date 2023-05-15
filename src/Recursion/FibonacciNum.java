package Recursion;

public class FibonacciNum {
    public static void main(String[] args) {
        int res = fibonacci(5);
        System.out.println(res);
    }
    static int fibonacci(int n){
        int n1=0;
        int n2=1;
        if(n==0 || n==1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
