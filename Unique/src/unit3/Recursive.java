package unit3;
import java.util.Scanner;
 class Fibonacci {
    int fibo(int n)
    {
        if(n<=1)
        return n;
        else
        return (fibo(n-1)+fibo(n-2));
    }
}
public class Recursive{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int nterms,i;
        System.out.println("Enter a number of terms:");
         nterms=sc.nextInt();
         Fibonacci obj=new Fibonacci();
         for(i=0;i<nterms;i++)
         {
             System.out.println(obj.fibo(i)+" \t");
         }

    }
}
