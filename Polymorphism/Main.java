package Polymorphism;
public class Main{
    public static void main(String[] args){
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();

        // Usual call of appropriate method from Appropriate classes
        shape.area();
        circle.area();
        square.area();

        // Calling method of Squares from Shapes --> Always access is determined in Runtime(Right side)
        //In runtime polymorphism, method call is determined at runtime, based on the actual object (right side), not the reference type (left side).
        Shapes square1=new Square();
        square1.area();

    }
}