package Anand;

public class StrongNumber {
    public static void main(String[] args) {
        int n=145;
        int x = n;
        int rem;
        int sum=0;
        while (n>0){
            rem = n % 10;
            int fact=1;


            for(int i=1; i<=rem; i++){
                fact = fact *i;
            }
            System.out.println("Fact of "+rem +" is " + fact);
            sum=sum+fact;
            n=n/10;
        }
        System.out.println("Sum Of factorial "+ sum);
        if(x == sum){
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not a strong number");
        }

    }
}
