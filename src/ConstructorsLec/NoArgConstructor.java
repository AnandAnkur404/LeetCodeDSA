package ConstructorsLec;

public class NoArgConstructor {
    String name = "Ankur";
    int rno = 30;

    NoArgConstructor() {

    }

    public static void main(String[] args) {
        System.out.println("We are creating a no argument constructor");
        NoArgConstructor N = new NoArgConstructor();
        System.out.println(N.name+" "+ N.rno);

//        in this type different object have same value bcz we have intialized value only once
        NoArgConstructor N1 = new NoArgConstructor();
        System.out.println(N1.name+" "+ N1.rno);

    }
}
