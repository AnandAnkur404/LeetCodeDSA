package WhileLoop;

import java.util.Scanner;

public class AllFactorsOfN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        factorsOfN(n);
        int n1 = input.nextInt();
        oddNumberOfN(n1);

        divisibleBy7EndWith7();
        noEndsWith7();
        divisibleBy4();
    }

    static void factorsOfN (int n){

        int i = 2;
        int count=0;
        while(i<=n){
            if(n%i == 0 ){
                count++;
                System.out.println(i);
            }
            i++;
        }
//        count will give total number of factor
        System.out.println(count);
    }

    static void oddNumberOfN(int n){
       int i = 1;
       while(i<200){
           if(i%2 != 0){
               System.out.println(i);
           }
           i++;
       }
    }
    static void divisibleBy7EndWith7(){
        int i = 7;
        while (i<=500){
            if(i%7 == 0 && i%10 == 7){
                System.out.println(i);
            }
            i++;
        }
    }
    static void noEndsWith7(){
        int i = 7;
        while (i<=300){
            if(i%10 == 7){
                System.out.println(i);
            }

            i++;

        }

    }
    static void divisibleBy4(){
        int i = 4;
        while (i <= 175){
            if(i%4 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
