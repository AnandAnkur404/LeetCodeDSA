package WhileLoop;

public class Factorial {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;
        while(i<=4){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
