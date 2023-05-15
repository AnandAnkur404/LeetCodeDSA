package ConstructorsLec;

public class DefaultConstructor {
    String name;
    int projectId;

//    created by compiler
//    DefaultConstructor(){
//        super();
//    }


    public static void main(String[] args) {

//        this type constructor compiler creates constructor and intialized its defaults value.
//        this type of contructor is called no argument constructor
        DefaultConstructor cd = new DefaultConstructor();
        System.out.println(cd.name + " " + cd.projectId);

        DefaultConstructor cd1 = new DefaultConstructor();
        System.out.println(cd1.name + " " + cd1.projectId);

        DefaultConstructor cd2 = new DefaultConstructor();
        System.out.println(cd2.name + " " + cd2.projectId);
    }
}
