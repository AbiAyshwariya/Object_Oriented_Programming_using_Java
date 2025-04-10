package OOPS.Abstraction;

public abstract class Parent{
    int age;
    final int VALUE;
    //Still a single class cannot extend (inherits) more than 1 parent class(Multiple Inheritence)
    public Parent(int age){
        this.age=age;
        VALUE=122345456;
    }

    abstract void career(String name);
    abstract void career(String name,int age);
}


