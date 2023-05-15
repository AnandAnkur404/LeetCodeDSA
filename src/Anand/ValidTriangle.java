package Anand;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st angle ");
        int angle1 = input.nextInt();

        System.out.println("Enter 2nd angle ");
        int angle2 = input.nextInt();

        System.out.println("Enter 3rd angle ");
        int angle3 = input.nextInt();

        if ((angle1 + angle2 + angle3 == 180) && angle1 != 0 && angle2 != 0 && angle3 != 0)
            System.out.println("Valid Triangle");

        System.out.println("Enter a valid angle to be triangle");


    }
}
