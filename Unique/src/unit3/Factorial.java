package unit3;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter a number:  ");
        number=sc.nextInt();
        Recursion obj=new Recursion();
        System.out.println("factorial of "+number+"!"+"="+obj.fact(number));
    }
}
class Recursion{
    int fact(int n){
        if (n==0)
        return 1;
        else
        return(n*fact(n-1));
    }
}