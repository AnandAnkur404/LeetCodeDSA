package HasARelationship;

public class Engine {
    String type;
    int hp;

    Engine(){

    }
    Engine(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }
    public void start(){
        System.out.println("Starting the engine");
    }
}
