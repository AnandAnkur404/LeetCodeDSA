public class AllBoutString {
    public static void main(String[] args) {


        String s1 = "Ankur";
        String s2 = "Anand";

//        + operator used as a concate string
        System.out.println(s1+s2);
        System.out.println(s1.concat("Java learning"));

        System.out.println(10+s1);
//        10Ankur
        System.out.println(10+20+s1);
//        30Ankur

        System.out.println(s1+(10-3));
//        Ankur7

        System.out.println(10+s2+20);

        System.out.println(s1+ s2 + 10+ 20);

        System.out.println(s1 + 20/10);

//        shorthand concept
        System.out.println(10>20? "1st no is larger":"True that 2nd no is larger");

//        join in string is a static function
        System.out.println(String.join(",",s1,s2,"Hello",s1,s2 , "Welcome to the world of coding"));

        String s = "Ankur";
        String str = "Ankur";
        System.out.println(s + " " + str);



    }
}
