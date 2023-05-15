package String;

public class StringPalindrome {
    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(s1));
//        isPalin(s1);
        System.out.println(isPalin(s1));

    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalin(String s){
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int len=s.length();
        int j=0;
        for (int i=len-1; i<=0; --i){
            if(s.charAt(j) != s.charAt(i)){
                return false;
            }
            j++;
        }
        return true;
    }


}
