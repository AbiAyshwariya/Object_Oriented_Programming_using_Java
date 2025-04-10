package Inheritance;

public class Box{
    double l;
    double h;
    double w;
    //default constructors when no parameters are passed
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    
    // Constructor when only one parameter
    Box(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }

    //Constructor when length, breadth and height parameters are passed
    Box(double w, double l,double h){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    //Constructor using another object as a parameter and Initialized using the values of that object
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
}
