package OOPS.Abstraction;

public class Main {
    public static void main(String args[]){
       Son son=new Son();
       son.career(" Doctor");
       Daughter daughter=new Daughter();
       daughter.career(" Rahmania ",25);

       // Eventhough objects of abstract classes cannot be created 
       //but it can be used as reference variable   
       Parent daughter1 = new Daughter();
       daughter1.career(" Engineer");

       //Final Abstract classes cannot be created
       //Abstract classes are created to be overriden and inherited and final
       //prevents it from overriding
       

    }
}
