package Recursion;

public class GCDofNum {
    public static void main(String[] args) {
        GCDofNum num = new GCDofNum();
        int res = num.gcdOfNum(12, 8);
        System.out.println(res);
    }
    int gcdOfNum(int a, int b){
        if(b==0)
            return a;

        return gcdOfNum(b, a%b);
    }
}
