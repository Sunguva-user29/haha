package unique.unit5;
import java.util.Scanner;
public class ExceptionHandaling {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("TWO NUMBERS :");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            System.out.println(a/b);

        }
        catch(ArithmeticException e){
            System.out.println(e);

        }
    }
    
}
