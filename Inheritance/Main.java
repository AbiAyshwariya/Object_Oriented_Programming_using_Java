package Inheritance;
public class Main{
    public static void main(String[] args){
        // Parent from Parent Inheritance
        //Initialize with the constructors based on parameters used in Object Creation
        Box box1=new Box();
        Box box2=new Box(4);
        Box box3=new Box(4,5,6);
        Box box4=new Box(box2);
        System.out.println("Box Width: "+box1.w+"|| Box Length: "+box1.l+"|| Box Height: "+box1.h);
        System.out.println("Box Width: "+box2.w+" || Box Length: "+box2.l+" || Box Height: "+box2.h);
        System.out.println("Box Width: "+box3.w+" || Box Length: "+box3.l+" || Box Height: "+box3.h);
        System.out.println("Box Width: "+box4.w+" || Box Length: "+box4.l+" || Box Height: "+box4.h);

        //Child from Child Inheritance
        BoxWeight box5=new BoxWeight();
        BoxWeight box6=new BoxWeight(4,5,6,7);
        System.out.println("Box Width: "+box5.w+" || Box Length: "+box5.l+" || Box Height: "+box5.h+"||Box Weight: "+box5.weight);
        System.out.println("Box Width: "+box6.w+" || Box Length: "+box6.l+" || Box Height: "+box6.h+" ||Box Weight: "+box6.weight);

        //Parent from Child Inheritance
        Box box7=new BoxWeight(2,3,4,5);
        // System.out.println("Box Weight: "+box7.weight); // X(Not Allowed ...Access variables only from reference Type(Box))
        System.out.println("Box Length: "+box7.l); // Allowed ... Since variable is defined in type Box

        //Child from Parent Reference
        // BoxWeight box8=new Box();
        // System.out.println("Box Length: "+box7.l);// Allowed....

        // Multiple Inheritance Example
        BoxPrice box9=new BoxPrice();
        BoxPrice box10=new BoxPrice(5,8,200);
        System.out.println("Box Price: "+box9.cost);
        System.out.println("Box Price: "+box10.cost);

        // Hierarchial Inheritance
        BoxColor colorBox = new BoxColor(2, 3, 4, 5, 100, "Blue");
        System.out.println("Box Color: " + colorBox.color + " | Cost: " + colorBox.cost + " | Weight: " + colorBox.weight);

        
    }
}