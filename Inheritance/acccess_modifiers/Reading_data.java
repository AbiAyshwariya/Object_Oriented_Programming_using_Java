import java.util.Scanner;
class Reading_data{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int intnumber=0;
        float floatnumber=0.0f;
        try{
            System.out.println("Enter an integer: ");
            intnumber=in.nextInt();
            System.out.println("Enter a floating number: ");
            floatnumber=in.nextFloat();

        }
        catch(Exception e){
            System.out.println("Input Error:"+e);
        }
        System.out.println("intNumber="+intnumber);
        System.out.println("Float Number: "+floatnumber);
    }
}