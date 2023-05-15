package Anand;

public class Program {

    int x;
    int a = 25;
    static double b = 30.1;

    public Program(int x) {
        this.x = 9;
    }

    public static void main(String[] args) {
        boolean c = true;
//        Program p = new Program();
//        MaxSubArray samePackage = new MaxSubArray();

//        Hence MaxSubArray is the class in the same package Anand
//        it will work same as Program class

        Program p = new Program(9);
        System.out.println(p.x/0);
//        Exception in thread "main" java.lang.ArithmeticException: / by zero

//        System.out.println(p.a);

//        System.out.println(b);
//        System.out.println(c);
    }
}
