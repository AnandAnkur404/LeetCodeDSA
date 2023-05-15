package Oops.Properties.Inheritance;

public class Animal {

    void eat(){
        System.out.println("Show Your four leg ");

    }
    void leg(int n){
        System.out.println("This animal have 4 legs");

    }
}
class Dog extends Animal {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();
        Dog d2 = new Dog();
        d2.leg(3);
        d2.eat();

    }
}
