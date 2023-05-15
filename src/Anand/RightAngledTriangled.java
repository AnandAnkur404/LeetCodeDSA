package Anand;

import java.util.Scanner;
public class RightAngledTriangled {



    public class RightTriangleChecker {
        public static boolean isRightTriangle(int a, int b, int c) {
            if (a*a + b*b == c*c) {
                return true;
            } else if (a*a + c*c == b*b) {
                return true;
            } else if (b*b + c*c == a*a) {
                return true;
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first side: ");
            int a = sc.nextInt();
            System.out.print("Enter the second side: ");
            int b = sc.nextInt();
            System.out.print("Enter the third side: ");
            int c = sc.nextInt();
            if (isRightTriangle(a, b, c)) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Not a Right Triangle");
            }
            sc.close();
        }
    }

}
