package String;

public class LastWordLen {
    public static void main(String[] args) {
        String str = "Hello i am software engineer at google and doing moonlighting at facebook";
//        System.out.println(lenOfLastWord(str));
        System.out.println(lenOfLastWord1(str));
    }
    static int lenOfLastWord(String s){

        String[] word = s.split(" ");
        String lastWord = word[word.length-1];
        int len = lastWord.length();
        return len;
    }
    static int lenOfLastWord1(String s){
        String s1 = s.trim();
        int len = 0;

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == ' '){
                len = 0;
            }
            else
                len++;

        }
        return len;
    }
}
