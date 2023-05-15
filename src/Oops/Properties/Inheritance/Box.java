package Oops.Properties.Inheritance;

public class Box {

        double l;
        double h;
        double w;

//      we need a way to add the values of the above properties object by object
//      we need one word to access every object
//      this keyword is used to access every object

        Box () {
            this.l = -1;
            this.h = -1;
            this.w = -1;
        }
//        cube
        Box(double side){
            this.l = side;
            this.h = side;
            this.w = side;
        }

        Box(double l, double h, double w) {
            this.l = l;
            this.h = h;
            this.w = w;
        }
//        copy constructor
        Box (Box old){
            this.l = old.l;
            this.h = old.h;
            this.w = old.w;
        }
}
