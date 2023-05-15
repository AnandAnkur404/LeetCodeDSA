package Anand;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;
        int x = n;
        int rev=0;
        int rem;
        while(n>0){
            rem = n%10;
            rev = rev * 10 + rem;
            n=n/10;
        }
        System.out.println(rev);
        if (rev == x){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
