package Anand;

public class FactorialOfEachNo {
    public static void main(String[] args) {
        int n = 98692;
        int rem;
        while (n>0){
            rem = n % 10;

            int fact=1; int i=1;
            while (i<=rem){
                fact = fact*i;
                i++;
            }
            System.out.println("fact of:" + rem +"! is " + fact);
            n = n/10;
        }
    }
}
