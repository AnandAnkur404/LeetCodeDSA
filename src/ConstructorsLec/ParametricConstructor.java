package ConstructorsLec;

public class ParametricConstructor {
    String name;
    int pc;

    ParametricConstructor(String nme, int pco){
        /* this keyword is used to reference variable */
        this.name = nme;
        this.pc = pco;
    }

    public static void main(String[] args) {
        ParametricConstructor P1 = new ParametricConstructor("Ankur", 100);
        System.out.println(P1.name + " " + P1.pc );

        ParametricConstructor P2 = new ParametricConstructor("Anand", 101);
        System.out.println(P2.name + " " + P2.pc );
    }
}
