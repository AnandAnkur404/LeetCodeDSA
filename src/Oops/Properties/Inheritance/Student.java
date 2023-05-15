package Oops.Properties.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Student {
    int rno;
    String name;
    float marks;



//    constructor overloading
    Student(){
        this.rno = 34;
        this.name = "ANkur";
        this.marks = 34.9F;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.rno = other.rno;
    }

    public static void main(String[] args) {
        Student Ankur = new Student();
        System.out.println(Ankur.name +" " + Ankur.marks);
        Student Hey = new Student(90,"ki",89.9f);
        Student s1 = new Student();

    }

}
