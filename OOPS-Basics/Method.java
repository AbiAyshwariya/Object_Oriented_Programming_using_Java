import java.util.Scanner;
public class Method{
    public static void main(String[] args){
        String message=greet("Ayshu");
        System.out.println("Greeting message: ");
    }

    static String greeting(name){
        String ans="Hello"+name;
        return ans;
    }
}