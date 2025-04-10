package Inheritance;

public class BoxColor extends BoxPrice{
    String color;
    BoxColor(){
        super();
        this.color="white";
    }
    BoxColor(BoxColor other){
        super(other.w,other.l,other.h,other.weight,other.cost);
        this.color=other.color;
    }

    BoxColor(double w, double l, double w, double weight, double price,String color){
        super(w,l,h,weight,price);
        this.color=color;
    }

    BoxColor(double side, double weight, double cost,String color){
        super(side,weight,cost);
        this.color=color;

    }
}