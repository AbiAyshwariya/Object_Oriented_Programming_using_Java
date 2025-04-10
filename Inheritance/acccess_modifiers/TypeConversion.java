public class TypeConversion{
    public static void main(String[] args){
        int a=125;
        byte k=(byte)a;
        float f=5.6f;
        int t=(int)f;
        //Type Promotion 
        byte m=10;
        byte n=30;
        int result=m*n;
        System.out.println("Result :" +result);
        System.out.println(((Object) result).getClass().getSimpleName());
    }
}