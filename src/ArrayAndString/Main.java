package ArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            double sal = sc.nextDouble();

            Employee s = new Employee(id,name, sal);
            employees[i]=s;


        }

        for (int i = 0; i < 3; i++) {
            System.out.println(employees[i].toString());


        }
    }
}
