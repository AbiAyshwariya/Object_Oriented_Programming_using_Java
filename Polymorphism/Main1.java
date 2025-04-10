package Polymorphism;
public class Main1 {
    public static void main(String[] args) {
        Box.greeting();         // Calls Box's version
        BoxWeight.greeting();   // Calls BoxWeight's version

        //Returns only from Box and Not from the Box Weight as per the convention, All the methods,variables and properties from a 
        // static method are already inherited ,irrespective of object is called or not
        Box box1 = new BoxWeight();
        box1.greeting();        // Still calls Box's version, not BoxWeight's!
    }
}
