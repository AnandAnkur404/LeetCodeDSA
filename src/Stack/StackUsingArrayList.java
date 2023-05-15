package Stack;

import java.util.Stack;
public class StackUsingArrayList {
     static Stack<Character> c = new Stack<>();

    public static void main(String[] args) {
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        s.push(6);
//
//        System.out.println(s.peek());
//        s.pop();
//        System.out.println(s.peek());
//        s.pop();
//        System.out.println(s);

//        String strn = "((())()(()";
//        System.out.println(strn);

        String str = "(())";
        isValidParenthesis(str);
//       System.out.println(isValidParenthesis(str));

    }

    static void isValidParenthesis(String str){


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            c.push(ch);
            char c1 = c.peek();
//            if (!c.empty()){
//                c.push(ch);
//            }
//            if (ch == c.peek()){
//                c.push(ch);
//            }

            c.pop();
        }

        System.out.println(c);
    }
}
