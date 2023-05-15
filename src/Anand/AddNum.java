package Anand;

public class AddNum {
    public static void main(String[] args) {
        System.out.println(fact(6));
        System.out.println(addNum(900,3));
    }
    static int fact(int n) {
        if (n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }
    static int addNum(int a, int b){
        int c = a>b?a:b;
        int d = a<b?a:b;
        int diff = c-d;
        c*=2;
        int res = (int) Math.pow(7,3);
        return c - diff;
    }
    static int revInt(int x){
        int res=0;
        while (x>0){
            int ans = x % 10;
            if( ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10){
                return 0;
            }
//          res = res
        }

        return res;
    }
}
