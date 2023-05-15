package HasARelationship;

public class Car {

    String name;
    double price;

    Car(){

    }
    Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Car is " + name);
    }

}
