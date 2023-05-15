package CoditionalOperator;

import javax.swing.*;
import java.util.Scanner;

//import static jdk.internal.vm.ThreadContainers.next;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        int n3 = input.nextInt();

//        greater no between 2 no.
//        String str = n1 > n2 ? n1+" is big" : n2+" is big";
//        System.out.println(str);
//
//        boolean p = n1 % 10 == 7 ? n2 % 7 == 0 : false;
//        System.out.println(p);

//        valid triangle or not
//        String res = (n1 + n2 > n3 || n2 + n3 > n1 || n1 + n3 > n2) ? "Valid Triangle" : "Not a valid Triangle";
//        String res = (n1+n2 > n3) ? (n2+n3>n1 ? (n1+n3>n2 ? "Valid Triangle" : "Valid Triangle") : "Valid Triangle") : n2+n3>n1? "valid":"not valid";
//        System.out.println(res);


//        n1 = 20 , n2 = 15, n3 = 30
//        biggest number among 3 number
//        int res = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
//        System.out.println(res);

//         greatest among 4 numbers
//        int n4 = input.nextInt();
//        int n = (n1>n2) ? (n1>n3) ? (n1>n4 ? n1:n4) : (n2 > n3 ? n2:n3) : (n3>n4 ? n3:n4);
//        int n = (n1>n2) ? n1>n3 ? (n1>n4 ? n1: n4)
//        System.out.println(n);

//         Entered char is alphabet or not
//        char ch = input.next().charAt(0);
//        String res = (ch>='a' && ch<='z') || (ch<='A' && ch>='Z') ? "Entered char is alphabet" : "Not alphabet";
//        System.out.println(res);

//         char is vowel or not
//        char ch1 = input.next().charAt(0);
//        String str = ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') ||
//                        (ch1 == 'A' ||  ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U')) ? "Its a vowel" : "Its not a vowel";
//        System.out.println(str);

//        Entered char is lowercase or not
        char ch2 = input.next().charAt(0);
        String res1 = (ch2>='a' && ch2<='z')  ? "Entered char is in Lowercase" : "Entered char is not in Lowercase";
        System.out.println(res1);

//        char ch2 = input.next().charAt(0);
//        String str = ch2>='a' ? (ch2<='z' ? "Entered char is lowercase" : "Entered char is not lowercase") : "Entered char is not lowercase";
//        System.out.println(str);

//          char is alphabet or not
//        char ch2 = input.next().charAt(0);
//        String str = (ch2>='a') ? (ch2<='z') ?  : "Yes" : "Yes" : "No" ;
//        System.out.println(str);

//        greatest number among 5 no
//        int n5 = input.nextInt();
//        int res = n1>n2 ? n1>n3 ? n1>n4 ? (n1>n5 ? n1:n5) : (n2>n4?n2:n4) : (n3>n4?n3:n4) : (n4>n5?n4:n5);
//        System.out.println(res);
    }
}
