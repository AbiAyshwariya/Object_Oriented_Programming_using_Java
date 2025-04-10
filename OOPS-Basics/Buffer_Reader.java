import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Buffer_Reader{
    public static void main(String[] args){
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        try{
            System.out.println("Enter a number as a String : ");
            String input=br.readLine();
            System.out.println("The Datatype of the variable n is:"+(((Object) input).getClass().getSimpleName()));
            int n=Integer.parseInt(input);
            System.out.println("Square is:"+(n*n));
            System.out.println("The Datatype of the variable n is:"+(((Object) n).getClass().getSimpleName()));
        }
        catch(IOException ioe){
            System.out.println("Input Error:"+ioe);
        }
    }
}