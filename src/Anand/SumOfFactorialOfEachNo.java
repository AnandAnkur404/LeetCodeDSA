package Anand;

public class SumOfFactorialOfEachNo {
    public static void main(String[] args) {
        int rem; int n=223434;
        int fact=1; int i=1;
        int sum=0;
        while (n>0){
            rem = n%10;


            while(i <= rem){
                fact = fact*i;
                i++;
            }

            System.out.println("fact of "+ rem+ "! " + fact);
            n = n/10;
        }
//        sum = sum + fact;
//        System.out.println(sum);

    }
}
