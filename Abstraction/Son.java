package OOPS.Abstraction;

public class Son extends Parent{
    @Override
    void career(String name){
        System.out.println("I am going to be a Doctor"+name);
    }

    @Override
    void career(String name, int age) {
        System.out.println("I love"+name+"She is :"+age);
    }
    
}
