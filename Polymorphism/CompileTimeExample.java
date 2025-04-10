package Polymorphism;

// In this type..Java Determines from which class to access @compile time
public class CompileTimeExample{
    
    //Overloading based on Return type and type of parameters
    double sum(double a,int b){
        return a+b;
    }
    
    //Overloadig based on the datatype of the formal arguments
    double sum(int a,int b){
        return a+b;
    }
    
    // Overloading based on the number of parameters
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args){
        CompileTimeExample obj=new CompileTimeExample();
        System.out.println("Sum using type of parameters: "+obj.sum(2,3));
        System.out.println("Sum using the number of parameters: "+obj.sum(4,5,6));


    }
}