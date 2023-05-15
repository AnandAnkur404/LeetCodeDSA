package Anand;

public class MainMethodOverload {

//    JVM has a predefined calling method that JVM will only call the main method with the definition of "public static void main(String[] args)"
//   Only Main method with args String[] will be called by jvm
    public static void main(String[] args) {
        System.out.println("Hello This is an example of main method overloading");
    }

    public static void main(int[] args) {
        System.out.println("Taking integer as an arguments in the main method");
    }

    public static void main(float[] args) {
        System.out.println("Taking integer as an arguments in the main method");
    }

    public static void main(double[] args) {
        System.out.println("Taking integer as an arguments in the main method");
    }

    public static void main(char[] args) {
        System.out.println("Taking integer as an arguments in the main method");
    }
}
