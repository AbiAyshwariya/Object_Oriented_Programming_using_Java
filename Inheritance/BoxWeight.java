package Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double w, double l, double h,double weight){
        super(w,l,h);
        this.weight=weight;
    }
    public BoxWeight(double side, double weight){
    super(side); 
    this.weight = weight;
    }
}