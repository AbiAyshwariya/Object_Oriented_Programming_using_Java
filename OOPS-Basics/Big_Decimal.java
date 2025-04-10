import java.math.BigDecimal;
import java.util.Scanner;
public class Big_Decimal{
    public static void main(String[] args){
        System.out.println("Enter two variables: ");
        Scanner in = new Scanner(System.in);
        BigDecimal bg1=in.nextBigDecimal();
        BigDecimal bg2=in.nextBigDecimal();
        System.out.println("Result is : "+bg1.add(bg2));
    }
}